package com.test.test_of_thymeleaf.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import javax.validation.constraints.Size;

public class AR225
{
    @PastOrPresent (message = "Must be a present or past year")
    @Size (min = 4, max = 4, message = "Must be 4 types long")
    @NotNull
    private String Year;

    public String getYear()
    {
        return Year;
    }

    public void setYear(String Year)
    {
        this.Year = Year;
    }


}
