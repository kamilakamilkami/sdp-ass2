interface Button {
    void display();
}

interface Checkbox{
    void display();
}

class LightButton implements Button{
    @Override
    public void display(){
        System.out.println("Light button");
    }
}

class DarkButton implements Button{
    @Override
    public void display(){
        System.out.println("Dark button");
    }
}

class LightCheckbox implements Checkbox{
    @Override
    public void display(){
        System.out.println("Light checkbox");
    }
}

class DarkCheckbox implements Checkbox{
    @Override
    public void display(){
        System.out.println("Dark checkbox");
    }
}

interface ThemeFactory{
    Button createButton();
    Checkbox createCheckbox();
}

class LightThemeFactory implements ThemeFactory{
    @Override
    public Button createButton(){
        return new LightButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new LightCheckbox();
    }
}

class DarkThemeFactory implements ThemeFactory{
    @Override
    public Button createButton(){
        return new DarkButton();
    }

    @Override
    public Checkbox createCheckbox(){
        return new DarkCheckbox();
    }
}