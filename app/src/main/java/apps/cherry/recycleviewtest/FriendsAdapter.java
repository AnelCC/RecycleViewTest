package apps.cherry.recycleviewtest;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Switch;
import android.widget.TextView;


import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;
import java.util.Map;

import apps.cherry.recycleviewtest.data.entities.Friend;

/**
 * Created by anel.calvo on 28/02/17.
 */

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.FriendsViewHolder> {
    private final String TAG = getClass().getSimpleName();
    public static List<Friend> items;
    public static Activity activity;


    public FriendsAdapter(Activity activity, List<Friend> items) {
        this.items = items;
        this.activity= activity;
        Log.e(TAG, items.toString());
    }


    public static class FriendsViewHolder extends RecyclerView.ViewHolder {

        LinearLayout itm_friend;
        TextView txt_title, txtName,txtSurname, txtUrl;

        public FriendsViewHolder(View itemView) {
            super(itemView);

            itm_friend              =  itemView.findViewById(R.id.itm_friend);
            txt_title               =  itemView.findViewById(R.id.title);
            txtName                 =  itemView.findViewById(R.id.txtName);
            txtSurname              =  itemView.findViewById(R.id.txtSurname);
            txtUrl                  =  itemView.findViewById(R.id.txtUrl);

        }
    }


    @Override
    public FriendsAdapter.FriendsViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_friend, viewGroup, false);
        return new FriendsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FriendsAdapter.FriendsViewHolder holder, int position) {
        holder.txt_title.setText(items.get(position).getTitle());
        holder.txtName.setText(items.get(position).getName());
        holder.txtSurname.setText(items.get(position).getLastName());
        holder.txtUrl.setText(items.get(position).getUrl());

    }

    @Override
    public int getItemCount() {
        return items.size();
    }


}