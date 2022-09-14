package adapter;

import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.example.projetobruna1.R;
import com.example.projetobruna1.model.model.User;
import java.util.List;

public class UsersAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<User> dados;

    public UsersAdapter(List<User> dados) {
        this.dados = dados;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layoutVH = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_user_vh, parent, false);
        return new UserViewHolder(layoutVH);
        //esse mteodo vai criar o viewholder caso necessário, para funcionar precisamos inflar o layout, que é  que está sendo feito na primeira linha
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
    //o viewholder é a caixinha onde vamos colocar os dados
        User obj = dados.get(position);
        TextView tv1 = ((UserViewHolder) holder).itemView.findViewById(R.id.textViewId);
        tv1.setText(obj.getId()+"");
        ((TextView)((UserViewHolder) holder).itemView.findViewById(R.id.textViewName)).setText(obj.getName());
    }

    @Override
    public int getItemCount() {
        return dados.size();
        //esse metodo devolve para o recyclerview a qtd de elementos que ele tem como dados
    }
}

class UserViewHolder extends RecyclerView.ViewHolder{
    public View view;
    public UserViewHolder(@NonNull View itemView){
        super(itemView);
        view = itemView; //representa qual a view vai estar dentro do viewholder
        //view é a classe mais abstrata que segura todos os itens que estão na view
    }
}