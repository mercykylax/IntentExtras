package com.example.intentextras.receiver_package;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

//import com.example.intentextras.Age;
import com.example.intentextras.R;

import java.util.List;

public class ReceiverAdapter extends ArrayAdapter<ReceiverAdapter> {
    private ThreadGroup Age;

    public ReceiverAdapter(Context context, int resource, List<ReceiverAdapter>receiverAdapters){
        super(context,resource,receiverAdapters);
    }
    @Override
   public View getView(int position, View convertView, ViewGroup parent) {
        ReceiverAdapter receiverAdapter = getItem(position);
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.content_receiver,parent,false);
        }
        TextView tvName = convertView.findViewById(R.id.tvName);
        TextView tvAge = convertView.findViewById(R.id.tvAge);
        tvName.setText(Age.getName());
        tvAge.setText(Age.getName());
        return convertView;
    }
//}
    }


