import java.util.*;
interface GeneTree 
{

}

class Grand extends Folks implements GeneTree {
    public Map<Integer, String> fami1;
    public Grand(int choi)
    {
        super(choi);
        System.out.println("   |");
        this.fami1 = new HashMap<Integer, String>();
        this.fami1.put(1, "Алексей Михайлович Романов + Наталья Нарышкина");
        if (choi>fami1.size()) { System.out.println("Ошибка!"); }
        else System.out.println(fami1.get(choi));
    }

    public void getfami(Map<Integer, String> family) 
    {
        int size = family.size();
        
    }
}
class Folks extends Kids implements GeneTree {
    public Map<Integer, String> fami1;
    public Folks(int choi)
    {
        super(choi);
        System.out.println("   |");
        this.fami1 = new HashMap<Integer, String>();
        this.fami1.put(2, "Иван V Романов + Прасковья Салтыкова");
        this.fami1.put(3, "Фёдор III Романов + Марфа Апраксина");
        this.fami1.put(1, "Пётр I Романов + Екатерина I Михайлова");
        if (choi>fami1.size()) { System.out.println("Ошибка!"); }
        else System.out.println(fami1.get(choi));
    }
}
class Kids implements GeneTree 
{
    public Map<Integer, String> fami1;
    public Map<Integer, String> fami3;
    public Kids(int choi) 
    {
        if (choi == 1)
        {
            this.fami1 = new HashMap<Integer, String>();
            this.fami1.put(1, "Алексей Петрович Романов");
            this.fami1.put(2, "Елизавета Романова");
            this.fami1.put(3, "Анна Петровна Романова");
            System.out.println(this.fami1.values());
        }
        else if (choi == 2) 
        {
            this.fami3 = new HashMap<Integer, String>();
            this.fami3.put(1, "Анна Иоанновна Романова");
            this.fami3.put(2, "Екатерина Романова");
            System.out.println(this.fami3.values());
        }
        else 
        {
            System.out.println("Детей нет.");
        }
    }
}
/**
 * DZ
 */
public class DZ 
{
    public static void main(String[] args) 
    {
        Scanner work = new Scanner(System.in);
        System.out.println("Исследователь генеалогического дерева. Введите номер желаемого поколения (1/2/3 - от старого до молодого");
        String old = work.nextLine();
        // int famsi = Grand.fami3.size();
        System.out.println("Введите номер желаемой ветки (доступно: "  );
        String fami = work.nextLine();
        int famint = Integer.parseInt(fami);
        System.out.println();
        if (old.equals("1")) 
        {
            GeneTree gene = new Grand(famint);
        }
        else if (old.equals("2")) 
        {
            GeneTree gene = new Folks(famint);
        }
        else if (old.equals("3")) 
        {
            GeneTree gene = new Kids(famint);
        }
        System.out.println();
        work.close();
    }
    
}