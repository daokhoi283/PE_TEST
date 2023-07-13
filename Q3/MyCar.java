import java.util.List;
public class MyCar implements ICar{
    public int f1(List<Car> list){
        int sum = 0;
        for(int i=0; i < list.size(); i++){
            sum += list.get(i).getRate();
        }
        return (sum/list.size());
    } 
    public void f2(List<Car> list) {
        int maxRate = list.get(0).getRate();
        int indexMax = 0;
        int indexMin = 0;
        int minRate = list.get(0).getRate();
        for(int i=1; i < list.size(); i++){
            if(maxRate < list.get(i).getRate()){
                maxRate = list.get(i).getRate();
                indexMax = i;
            }
            if(minRate > list.get(i).getRate()){
                minRate = list.get(i).getRate();
                indexMin = i;
            }
        }
        for(int i=0; i < list.size();i++){
            int getRate = list.get(i).getRate();
            if(getRate == minRate && i == indexMin){
                list.set(indexMax, list.get(i));
            }
            else if(getRate == maxRate){
                list.set(indexMin, list.get(i));
            }
        }
    } 
    public void f3(List<Car> t) {
    }
    }
