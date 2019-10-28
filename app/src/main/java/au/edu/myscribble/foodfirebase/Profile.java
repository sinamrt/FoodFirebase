package au.edu.myscribble.foodfirebase;

public class Profile
{
    public String ingredients;
    public String method;
    public String description;
    public String name;
    public Boolean permission;
    public String url;
    public int rating;


    public Profile()
    {
    }



    public Profile(String ingredients,String method,String description,String name,Boolean permission,String url,int rating)
    {
        this.ingredients = ingredients;
        this.method = method;
        this.description = description;
        this.name = name;
        this.permission = permission;
        this.url = url;
        this.rating = rating;
    }

    public int getRating()
    {
        return rating;
    }

    public String getDescription()
    {
        return description;
    }

    public String getIngredients()
    {
        return ingredients;
    }

    public String getMethod()
    {
        return method;
    }

    public void setRating(int rating)
    {
        this.rating = rating;
    }

    public String getName()
    {
        return name;
    }

    public Boolean getPermission()
    {
        return permission;
    }

    public String getUrl()
    {
        return url;
    }


    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPermission(Boolean permission)
    {
        this.permission = permission;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
