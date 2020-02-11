

float age;

System.out.println("Enter a person's age:");
age=input.nextFloat();

if (age < 1) 
{
	System.out.println("The person is an infant");
}

else if ((age >= 1)&& (age < 3))
{
	System.out.println("This person is a toddler");
}

else if ((age >= 3) && (age < 13))
{
	System.out.println("This person is a child");
}

else if ((age >= 13) && (age < 18))
{
	System.out.println("This person is a teenager");
}

else if ((age >= 18) && (age < 65))
{
	System.out.println("This person is a adult");
}

else if (age >= 65)
{
	System.out.println("This person is a senior");
}

}
}
