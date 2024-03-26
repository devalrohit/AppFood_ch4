package com.example.appfoodch4.prensentation.home


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.appfoodch4.R
import com.example.appfoodch4.presentation.foodlist.adapter.CategoryAdapter
import com.example.appfoodch4.databinding.FragmentHomeBinding
import com.example.appfoodch4.presentation.foodlist.adapter.FoodAdapter
import com.example.appfoodch4.presentation.foodlist.adapter.OnItemClickedListener
import com.example.appfoodch4.data.model.Food
import com.example.appfoodch4.data.datasource.FoodDataSource
import com.example.appfoodch4.data.datasource.FoodDataSourceImpl
import androidx.recyclerview.widget.GridLayoutManager
import androidx.core.content.ContextCompat
import androidx.core.os.bundleOf
import androidx.navigation.fragment.findNavController
import com.example.appfoodch4.data.model.Category
import com.example.appfoodch4.prensentation.detailproduct.DetailFoodActivity


class HomeFragment : Fragment() {

    private lateinit var binding: FragmentHomeBinding
    private var adapter: FoodAdapter? = null
    private val dataSource: FoodDataSource by lazy { FoodDataSourceImpl() }
    private var isUsingGridMode: Boolean = false
    private val categoryAdapter = CategoryAdapter()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setListCategory()
        setButtonText(isUsingGridMode)
        bindFoodList(isUsingGridMode)
        setClickAction()
    }

    private fun setClickAction() {
        binding.btnChangeListMode.setOnClickListener {
            isUsingGridMode = !isUsingGridMode
            setButtonText(isUsingGridMode)
            bindFoodList(isUsingGridMode)
        }

    }
    private fun navigateToDetail(item: Food) {
        val navController = findNavController()
        val bundle = bundleOf(Pair(DetailFoodActivity.EXTRAS_ITEM, item))
        navController.navigate(R.id.action_menu_tab_home_to_detailFoodActivity, bundle)
    }

    private fun setButtonText(usingGridMode: Boolean) {
        val drawableResId = if (usingGridMode) R.drawable.ic_vertikal else R.drawable.ic_horizontal
        val drawable = ContextCompat.getDrawable(requireContext(), drawableResId)
        binding.btnChangeListMode.setImageDrawable(drawable)
    }

    private fun bindFoodList(isUsingGrid: Boolean) {
        val listMode = if (isUsingGrid) FoodAdapter.MODE_GRID else FoodAdapter.MODE_LIST
        adapter = FoodAdapter(
            listMode = listMode,
            listener = object : OnItemClickedListener<Food> {
                override fun onItemClicked(item: Food) {
                    //navigate to detail
                    navigateToDetail(item)
                }
            })
        binding.rvAvengerList.apply {
            adapter = this@HomeFragment.adapter
            layoutManager = GridLayoutManager(requireContext(), if (isUsingGrid) 2 else 1)
        }
        adapter?.submitData(dataSource.getFoodMenu())
    }



    private fun setListCategory() {
        val data = listOf(
            Category(imgUrl = R.drawable.ic_all, name = "All"),
            Category(imgUrl = R.drawable.ic_chicken, name = "Chicken"),
            Category(imgUrl = R.drawable.ic_pizza, name = "Pizza"),
            Category(imgUrl = R.drawable.ic_burger, name = "Burger"),
            Category(imgUrl = R.drawable.ic_mie, name = "Mie"),
        )
        binding.rvCategory.apply {
            adapter = categoryAdapter
        }
        categoryAdapter.submitData(data)
    }


}
