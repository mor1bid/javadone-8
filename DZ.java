import java.util.*;
interface GeneTree 
{
    
}

class Grand implements GeneTree {
    public Map<Integer, String> fami3;
    public Grand(int choi) 
    {
        // this.fami3 = fami3;
        this.fami3 = new HashMap<Integer, String>();
        this.fami3.put(1, "Алексей Михайлович Романов + Наталья Нарышкина");
        // System.out.println("\t" + fami3);
        System.out.println(fami3.get(choi));
        GeneTree gene = new Folks(choi);
    }
    public void getfami() 
    {
        int size3 = fami3.size();
        
    }
}
class Folks extends Grand implements GeneTree {
    public Map<Integer, String> fami2;
    public Folks(int choi)
    {
        super(0);
        this.fami2 = new HashMap<Integer, String>();
        this.fami2.put(1, "Иван V Романов + Прасковья Салтыкова");
        this.fami2.put(2, "Фёдор III Романов + Марфа Апраксина");
        this.fami2.put(3, "Пётр I Романов + Екатерина I Михайлова");
        System.out.println(fami2.get(choi));
        GeneTree gene = new Kids(choi);
    }
}
class Kids extends Folks implements GeneTree {
    public Map<Integer, String> fami1;
    public Kids(int choi) 
    {
        super(0);
        this.fami1 = new HashMap<Integer, String>();
        this.fami1.put(1, "Алексей Петрович Романов");
        this.fami1.put(2, "Елизавета Романова");
        this.fami1.put(3, "Анна Петровна Романова");
        System.out.println(fami1.get(choi));
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
        // int famsi = Grand.fami3.size();
        System.out.println("Введите номер желаемой ветки (доступно: "  );
        String fami = work.nextLine();
        int famint = Integer.parseInt(fami);
        if (old.equals("3")) 
        {
            GeneTree gene = new Grand(famint);
        }
        else if (old.equals("2")) 
        {
            GeneTree gene = new Folks(famint);
        }
        else if (old.equals("1")) 
        {
            GeneTree gene = new Kids(famint);
        }
        work.close();
    }
    
}