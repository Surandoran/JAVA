package JAVA_BOOK;

import javafx.print.Collation;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

import static sun.java2d.cmm.ColorTransform.Out;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[9];

		for (int i = 0; i < 9; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
//
//		Integer.parseInt(Collections.max(arr));

	}
}