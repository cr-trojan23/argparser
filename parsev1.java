import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class parsev1{
    public static void main(String[] args){
        int num_args = args.length;
        //System.out.println(num_args);
        boolean bool_flag = false;
        int i = 0;
        List<String> arg_val_list = new ArrayList<String>();
        List<String> split_list = new ArrayList<String>();
        List<String> f_list = new ArrayList<String>();
        while(i<num_args && args[i].startsWith("--")){
            String temp_arg = args[i].replaceAll("--", "");
            arg_val_list.add(temp_arg);
            i++;
        }
        for(int j=0; j<arg_val_list.size(); j++){
            String[] split_arr = arg_val_list.get(j).split(":");
            split_list = Arrays.asList(split_arr);
            f_list.addAll(split_list);
        }
        //System.out.println(arg_val_list);
        //System.out.println(f_list);
        for(int x = 0; x<f_list.size();){
            String finalstr = f_list.get(x).concat("=").concat(f_list.get(x+1));
            System.out.println(finalstr);
            x+=2;
        }
            
    }
}