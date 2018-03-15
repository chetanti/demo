package com.chet;

public class Anagrams {

	static class Word 
    {
        String str;  // to store word itself
        int index; // index of the word in the 
                   // original array
        Word(String str, int index)
        {
            this.str = str;
            this.index = index;
        }
    }
	static class DupArray
    {
        Word[] array;  // Array of words
        int size;   // Size of array
         
        public DupArray(String str[], int size) 
        {
            this.size = size;
            array = new Word[size];
            int i;
            for (i = 0; i < size; ++i)
            {
                array[i] = new Word(str[i], i);
            }
        }    
    }
	
}
