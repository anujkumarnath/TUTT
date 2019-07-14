package com.androiddreams.tutt;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private int mItemCount;
    public RecyclerViewAdapter(int itemCount) {
        mItemCount = itemCount;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list_item, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return mItemCount;
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder{

        private TextView mSubject;
        private TextView mFaculty;
        private TextView mTime;
        private TextView mRoom;

        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);

            mSubject = itemView.findViewById(R.id.subject);
            mFaculty = itemView.findViewById(R.id.faculty);
            mTime = itemView.findViewById(R.id.time);
            mRoom = itemView.findViewById(R.id.room);

        }

        private void bind(int position) {
            mSubject.setText("Subject" + position);
            mFaculty.setText("Faculty" + position);
            mTime.setText("Time" + position);
            mRoom.setText("Room" + position);
        }
    }
}
