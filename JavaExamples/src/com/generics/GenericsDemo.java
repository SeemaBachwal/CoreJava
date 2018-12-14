package com.generics;

interface GenericInterface<T1, T2, T3, T4>{
	
}

class GenericClass1<T1, T2, T3, T4> implements GenericInterface<T1, T2, T3, T4>{
	
}

class GenericClass2<T1, T2, T3, T4, T5> implements GenericInterface<T1, T2, T3, T4>{
	
}

class GenericClass3<T1, T2, T3, T4, T5> implements GenericInterface<T1, T2, T3, T5>{
	
}

/*
class GenericClass4<T1, T2, T3> implements GenericInterface<T1, T2, T3, T4>
{
    //Compile time error, must have same number of type parameters
}
*/

/*class GenericClass5<T1, T2, T5, T6> implements GenericInterface<T1, T2, T3, T4>
{
    //Compile time error. must have same type of parameters
}*/

public class GenericsDemo {

	
	public static void main(String[] args) {
		
	}
}
