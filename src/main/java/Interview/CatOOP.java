package Interview;

public class CatOOP extends AnimalOOP {

 static int count; // для подсчета (посл задание)

    public CatOOP(String name) {
        super(name, 200, 0);
        count++;
    }
}
