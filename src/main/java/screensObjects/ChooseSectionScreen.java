package screensObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ChooseSectionScreen {

    public ChooseSectionScreen(AndroidDriver<?> driver) {

        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }


    // Main Categories

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='سيارات']")
    public AndroidElement Cars;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='عقارات']")
    public AndroidElement RealEstates;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='خدمات']")
    public AndroidElement Services;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='محركات وأليات']")
    public AndroidElement EnginesAndMechanisms;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='حرف ومقاولات']")
    public AndroidElement CraftsAndContracting;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='أثاث ومفروشات']")
    public AndroidElement Furniture;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='أجهزة وإلكترونيات']")
    public AndroidElement ElectronicsAndDevices;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='حيوانات']")
    public AndroidElement Animals;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='الأسرة والصحة']")
    public AndroidElement FamilyAndHealth;

    @AndroidFindBy(accessibility = "التنقل إلى أعلى")
    public AndroidElement BackButton;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='متفرقات']")
    public AndroidElement Miscellaneous;


    /// Cars

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='السيارات']")
    public AndroidElement TheCars;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='أمريكية']")
    public AndroidElement American;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='جي إم سي']")
    public AndroidElement GMC;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='سافانا']")
    public AndroidElement Savana;


    /// Real Estates

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='عقارات للإيجار']")
    public AndroidElement RealEstateForRent;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='عقارات للبيع']")
    public AndroidElement RealEstateForSale;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='عقارات دولية']")
    public AndroidElement InternationalRealEstate;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='عقارات قيد الإنشاء']")
    public AndroidElement RealEstateUnderConstruct;


    //// Real Estates -- Real Estates for sale

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='سكني']")
    public AndroidElement Residential;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='تجاري واستثماري']")
    public AndroidElement CommercialAndInvestment;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='شاليهات ومنتزهات']")
    public AndroidElement ChaletsAndParks;


    ///// Real Estates -- Real Estates for sale -- Resedential

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='بيوت / فلل']")
    public AndroidElement HouseAndVillas;

    ////// Territories

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='العاصمة']")
    public AndroidElement AlAsimah;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='الدسمة']")
    public AndroidElement AlDesmeh;


    /// Services

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='نقل عفش']")
    public AndroidElement TransferAndRelocation;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='ستالايت']")
    public AndroidElement Satellite;


    /// Engines And Mechanisms

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='الدراجات']")
    public AndroidElement Bikes;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='القوارب البحرية']")
    public AndroidElement MarineBoats;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='المحركات والمعدات الثقيلة']")
    public AndroidElement EnginesAndHeavyEquipment;


    /// Engines And Mechanisms -- Marine Boats

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='القوارب البحرية']")
    public AndroidElement Boats;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='جت سكي']")
    public AndroidElement JetSki;


    // CraftsAndContracting

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='ألومنيوم ومطابخ']")
    public AndroidElement AluminumAndKitchens;


    // Furniture

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='أثاث منزلي']")
    public AndroidElement HomeFurnishings;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='المفروشات']")
    public AndroidElement Upholstery;


    // Electronics And Devices

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='الأجهزة المنزلية']")
    public AndroidElement HouseholdAppliance;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='التليفونات وملحقاتها']")
    public AndroidElement TelephonesAndAccessories;


    /// Devices And Electronics -- Household Appliances

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='ثلاجات']")
    public AndroidElement Refrigerators;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='غسالات']")
    public AndroidElement Washers;


    // Animals

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='كلاب']")
    public AndroidElement Dogs;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='الخيل']")
    public AndroidElement Horses;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='قطط']")
    public AndroidElement Cats;


    // Health And Family

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='مستلزمات المرأة']")
    public AndroidElement WomenAccessories;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='مستلزمات الرجل']")
    public AndroidElement MenAccessories;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='مستلزمات الطفل']")
    public AndroidElement BabySupplies;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='الصحة']")
    public AndroidElement TheHealth;


    // Health And Family -- Women Accessories

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='ملابس']")
    public AndroidElement Clothes;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='أحذية وشنط']")
    public AndroidElement ShoesAndBags;


    // Miscellaneous

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='أشياء مطلوبة']")
    public AndroidElement WantedThings;

    @AndroidFindBy(xpath = "(//android.widget.TextView)[@text='مجانية / تبرعات']")
    public AndroidElement FreeAndDonations;

}