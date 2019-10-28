package au.edu.myscribble.foodfirebase;

public class Recipe
{
    public String ingredients;
    public String method;
    public String name;
    public Boolean permission;
    public String url;

    public Recipe(String ingredients,String method,String name,Boolean permission,String url)
    {
        this.ingredients = ingredients;
        this.method = method;
        this.name = name;
        this.permission = permission;
        this.url = url;

    }

    public String getIngredients()
    {
        return ingredients;
    }

    public String getMethod()
    {
        return method;
    }


    public String getName()
    {
        return name;
    }

    public Boolean getPermission()
    {
        return permission;
    }



    public void setIngredients(String ingredients)
    {
        this.ingredients = ingredients;
    }

    public void setMethod(String method)
    {
        this.method = method;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setPermission(Boolean permission)
    {
        this.permission = permission;
    }

    public String getUrl()
    {
        return url;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }
}


