package serial;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DataDeserial {
    private String _id;
    private String name;
    private String type;
    private int proteins;
    private int fat;
    private int carbohydrates;
    private int calories;
    private int price;
    private int v;
    private String image;
    private String imageMobile;
    private String imageLarge;
}
