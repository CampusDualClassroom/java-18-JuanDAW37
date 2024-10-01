package com.campusdual.classroom;

import com.campusdual.util.Utils;

public class Exercise18 {

	public static void main(String[] args) {
		int elem = Utils.integer("Introduce el número de elementos que debe de tener el array: ");
		int[] array = createAndInitializeArray(elem);
		showInlineArray(array);
	}

	public static int[] createAndInitializeArray(int elem){
		int[] array = new int[elem];
		for (int i = 0; i < array.length; i++){
			array[i] = i+1;
		}
		return array;
	}

	public static void showInlineArray(int[] array){
		String linea="";
		for (int i = 0; i < array.length; i++){
			if (i == array.length - 1){
				linea += array[i];
			}else{
				linea += array[i] + " ";
			}
		}
		System.out.println(linea);
	}
}
