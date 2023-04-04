package BuilderPattern;

public class TestBuilderPattern {
    public static void main(String[] args) {
        Computer computer = new Computer.Builder("500GB", "8GB")
                .setGraphicsCardEnabled(true)
                .setBluetoothEnabled(true)
                .build();
        System.out.println("Computer HDD: " + computer.getHDD());
        System.out.println("Computer RAM: " + computer.getRAM());
        System.out.println("Computer Graphics Card Enabled: " + computer.isGraphicsCardEnabled());
        System.out.println("Computer Bluetooth Enabled: " + computer.isBluetoothEnabled());
    }

}
