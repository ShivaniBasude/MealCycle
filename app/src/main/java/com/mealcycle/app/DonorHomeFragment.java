//
//package com.mealcycle.app;
//
//import android.os.Bundle;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.Button;
//
//import androidx.annotation.NonNull;
//import androidx.annotation.Nullable;
//import androidx.fragment.app.Fragment;
//
//public class DonorHomeFragment extends Fragment {
//
//    public DonorHomeFragment() {
//        // Required empty constructor
//    }
//
//    @Nullable
//    @Override
//    public View onCreateView(
//            @NonNull LayoutInflater inflater,
//            @Nullable ViewGroup container,
//            @Nullable Bundle savedInstanceState) {
//
//        return inflater.inflate(
//                R.layout.fragment_donor_home,
//                container,
//                false
//        );
//    }
//
//    @Override
//    public void onViewCreated(
//            @NonNull View view,
//            @Nullable Bundle savedInstanceState) {
//
//        Button btnAddFood = view.findViewById(R.id.btnAddFood);
//
//        btnAddFood.setOnClickListener(v -> {
//            if (getActivity() != null) {
//                startActivity(
//                        new android.content.Intent(
//                                getActivity(),
//                                AddFoodActivity.class
//                        )
//                );
//            }
//        });
//    }
//}
