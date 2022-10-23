package Class19;

public class HW1_A {

    /* Write program for multilevel inheritance where class C inherits from class B
       and Class B inherits from Class A.
     */
        public void deviceType()
        {
            System.out.println("Device type: Laptop");
        }
    }
    class HW1_B extends HW1_A{
        public void brand()
        {
            System.out.println("Brand: HP");
        }
        public void operatingSystem()
        {
            System.out.println("Operating System: Windows Operating System");
        }
    }
    class HW1_C extends HW1_B{
        public void laptopModel()
        {
            System.out.println("Model: HP Spectre x360");
        }
        public void operatingSystem()
        {
            System.out.println("Operating System: Windows 11 Home");
        }

        public void specs()
        {
            System.out.println("Specifications:\n" + "Intel® Core™ i7-11390H (up to 5.0 GHz, 12 MB L3 cache, 4 cores, 8 threads)\n" +
                               "Intel® Iris® Xe Graphics + 16 GB (Onboard)\n" +
                               "Intel® Integrated SoC\n" +
                               "512 GB PCIe® NVMe™ M.2 SSD");
        }


        public static void main(String[] args) {
            HW1_C obj = new HW1_C();
            obj.deviceType();
            System.out.println();
            obj.brand();
            System.out.println();
            obj.laptopModel();
            System.out.println();
            obj.operatingSystem();
            System.out.println();
            obj.specs();
        }
    }

