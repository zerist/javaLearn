import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class GroupStatis {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        for (int i = 0; i < m; i++) {
            int n=scn.nextInt();

            //样例数据
            int [] number=new int[n];
            //分组信息数据
            int [] group=new int[n];

            //不重复的数据集合
            Set<Integer> numberset=new TreeSet<Integer>();

            Set<Integer> groupset=new TreeSet<Integer>();
            //输入数据

            for (int j = 0; j < number.length; j++) {
                int value=scn.nextInt();
                number[j]=value;

                numberset.add(value);
            }

            for (int j = 0; j < number.length; j++) {
                int value=scn.nextInt();
                group[j]=value;
                groupset.add(value);
            }
            Map<Integer,Map<Integer,Integer>> groupInfo = new TreeMap<>();

            //初始化分组信息
            for (Integer v : groupset) {
                for (Integer nv : numberset) {
                    if(groupInfo.containsKey(v))
                    {
                        Map<Integer,Integer> map=groupInfo.get(v);
                        map.put(nv,0);
                    }else
                    {
                        Map<Integer,Integer> map=new TreeMap<Integer,Integer>();
                        map.put(nv, 0);
                        groupInfo.put(v, map);
                    }

                }
            }

            for (int j = 0; j < n; j++) {

                int key=group[j];
                int value=number[j];
                Map<Integer,Integer> mmap=groupInfo.get(key);
                int f=mmap.get(value);
                mmap.put(value,f+1);
            }

            for(Integer gno : groupset)
            {
                StringBuilder sb = new StringBuilder(gno+"="+"{");
                Map<Integer,Integer> map = groupInfo.get(gno);
                for(Integer num : numberset)
                {
                    sb.append(num+"="+map.get(num)+",");
                }
                String str = sb.toString();
                System.out.println(str.substring(0,str.length()-1)+"}");
            }





        }




    }

}