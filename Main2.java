public class Main2 {
    public static void main(String[] args) {
        ThemeFactory lightthemefactory = new LightThemeFactory();
        Button lightbutton = new LightButton();
        Checkbox lightcheckbox = new LightCheckbox();
        lightbutton.display();
        lightcheckbox.display();

        ThemeFactory darkThemefactory = new DarkThemeFactory();
        Button darkbutton = new DarkButton();
        Checkbox darkcheckbox = new DarkCheckbox();
        darkbutton.display();
        darkcheckbox.display();
    }
}
