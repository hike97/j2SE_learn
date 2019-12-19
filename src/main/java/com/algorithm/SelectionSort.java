package com.algorithm;


/**
 * @Author hike97
 * @Description 选择排序
 * @create 2019-12-18 17:04
 * @Modified By:
 **/
public class SelectionSort {
	public static void main (String[] args) {
		//先把能写的写出来
		int[] arr = {1, 3, 2, 4, 5, 6, 9, 8, 7};
		for (int i = 0; i < arr.length-1; i++) {
			//先找到最小值的位置 假设为0
			int minPos = i;
			for (int j = i + 1; j < arr.length; j++) {
				/*if (arr[j] < arr[minPos]) {
					minPos = j;
				}*/
				minPos = arr[j]<arr[minPos] ? j:minPos;
			}
			System.out.println ("minPos:" + minPos);
			swap (arr,i,minPos);
			System.out.println ("经过第" + i + "次循环之后，数组的内容：");
			print (arr);
			System.out.println ();
		}
		print (arr);

		//选择排序优化

	}
	//打印数组方法
	static void print(int [] arr ) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print (arr[i] + " ");
		}
	}
	//交换
	static void swap(int[]arr,int i,int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}