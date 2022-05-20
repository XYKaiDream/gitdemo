public class D0520anli {
    public static void main(String[] args) {
        PC pc = new PC();
        NotePad notePad = new NotePad();
        pc.brand = "戴尔";
        notePad.color = "black";
        pc.Cpu = "i7-12800H";
        pc.ram = "DDR5 16G";
        pc.disk = "希捷 1TB";
        System.out.println(pc.getDails());
    }
}
class Computer{
    public String Cpu;
    public String ram;
    public String disk;
    public String getDails() {
        return "Cpu的型号是:"+Cpu+"\nRAM的型号是:"+ram+"\n硬盘的型号是:"+disk;
    }
}
class PC extends Computer{
    public String brand;
}
class NotePad extends Computer{
    public String color;
}

