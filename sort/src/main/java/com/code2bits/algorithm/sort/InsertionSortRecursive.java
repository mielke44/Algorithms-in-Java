/**
 * MIT License
 * 
 * Copyright (c) 2017 André Maré
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.code2bits.algorithm.sort;


/**
 * Insertion sort is a sorting algorithm that builds the final sorted array (or list) one item at a time. 
 * The algorithm iterates over the list and removes the current element, finds the location within the 
 * sorted part of the list, and inserts it there.  This process is repeated until the whole list is 
 * sorted.
 * 
 * The InsertionSortRecursive class implements the InsertionSort algorithm by making use of recursion.
 * 
 * @author	André Maré
 */
public final class InsertionSortRecursive {
	
	
    public void sort(int[] collection) {
        if (collection != null) {
            insertionSort(collection);
        } else {
            throw new IllegalArgumentException("Input parameter for array to sort is null.");
        }
    } 


	private void insertionSort(int[] collection) {
	    int arrayLength = collection.length;
	    insertionSort(collection, arrayLength);
	}

	
	private void insertionSort(int[] collection, int recursiveValue) {
	    if (recursiveValue <= 1) {
	        return;
	    }
	    
	    insertionSort( collection, recursiveValue - 1);
	
	    int last = collection[recursiveValue-1];
	    int j = recursiveValue-2;
	  
	    while (j >= 0 && collection[j] > last) {
	        collection[j+1] = collection[j];
	        j--;
	    }
	    collection[j+1] = last;
	}

	
}