import java.util.*;
interface GeneTree 
{
    
}

class Grand implements GeneTree {
    public Map<Integer, String> fami3;
    public Grand(String choi) 
    {
        // this.fami3 = fami3;
        this.fami3 = new HashMap<Integer, String>();
        this.fami3.put(1, "Михаил Романов + Евдокия Стрешнева");
        if (choi.equals("1")) 
        {
            System.out.println("\t" + fami3);
        }
        else 
        {
            GeneTree gene = new Folks(choi);
        }
    }
    public void getfami() 
    {
        int size3 = fami3.size();
        
    }
}
class Folks extends Grand implements GeneTree {
    public Folks(String choi) 
    {
        super("bruh");
        System.out.println("3");
    }
}
class Kids extends Folks implements GeneTree {
    public Kids(String choi) 
    {
        super("bruh");
        System.out.println("4!");
    }
}
/**
 * DZ
 */
public class DZ {
    public void main(String[] args) 
    {
        Scanner work = new Scanner(System.in);
        System.out.println("Исследователь генеалогического дерева. Введите номер желаемого поколения (3/2/1 - от старого до молодого");
        String old = work.nextLine();
        if (old.equals("3")) 
        {
            // int famsi = Grand.fami3.size();
            System.out.println("Введите номер желаемой ветки (доступно: "  );
            String fami = work.nextLine();
            GeneTree gene = new Grand(fami);
        }
        work.close();
    }
    
}