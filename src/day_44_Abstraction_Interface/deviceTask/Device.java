package day_44_Abstraction_Interface.deviceTask;

public abstract class Device {

    private final String brand;
    private final String model;
    private double price;
    private String color;
    private final String size;
    private boolean hasBattery;
    private boolean hasPowerButton;

    public Device(String brand, String model, double price, String color, String size, boolean hasBattery, boolean hasPowerButton) {
        if (brand.isEmpty() || brand==null){
            throw new RuntimeException("Invalid brand!");
        }
        this.brand = brand;

        if (model.isEmpty() || model==null){
            throw new RuntimeException("Invalid model!");
        }
        this.model = model;

        setPrice(price);
        setColor(color);

        if (size.isEmpty() || size==null){
            throw new RuntimeException("Invalid size!");
        }
        this.size = size;
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price<0){
            throw  new RuntimeException("Invalid price!");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty() || color==null){
            throw new RuntimeException("Invalid color!");
        }
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public boolean isHasBattery() {
        return hasBattery;
    }

    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }

    public boolean isHasPowerButton() {
        return hasPowerButton;
    }

    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }


    public abstract void turnOn();
    public abstract void turnOff();

    @Override
    public String toString() {
        return getClass().getSimpleName()+"{"+
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}

    /*
    	1. Create an abstract class named Device:
			Variables:
					brand (final), model(final), price, color, size (final), hasBattery, hasPowerButton

			Encapsulate all the fields

			Add a constructor to set all the fields

						Condition:
							1. brand, model color and size can not be null (if obj == null means it's error)
							2. brand, model color and size can not be empty
							3. price can not be set to negative or zero

			Abstract Methods:
				turnOn(), turnOff()

			None Abstract methods:
				toString(): displays brand, model, price
     */




