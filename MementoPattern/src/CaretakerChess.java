import java.util.ArrayList;

public class CaretakerChess {
    private ArrayList<MementoChess> memlist = new ArrayList<MementoChess>();
    public void AddMen(MementoChess mem){
        memlist.add(mem);
    }
    public MementoChess getMen(int i){
        return memlist.get(i);
    }

}
