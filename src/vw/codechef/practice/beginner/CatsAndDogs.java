/**
 * 
 */
package vw.codechef.practice.beginner;

/**
 * @author vivek
 *
 */

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * @author vivek
 *
 */
public class CatsAndDogs implements Closeable {
	private InputReader in = new InputReader(System.in);
	private PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));

	/*
	 * The main problem solution method.
	 */
	public void solve() {
		int testCases = in.nextInt();
		for (int i = 0; i < testCases; i++) {
			long c = in.nextLong();
			long d = in.nextLong();
			long l = in.nextLong();

			if (l % 4 == 0 && l <= ((c + d) * 4) && l >= (4 * d)) {
				long cats = (4 * (c + d) - l) / 4;
				if (cats <= 2 * d)
					out.println("yes");
				else
					out.println("no");
			} else {
				out.println("no");
			}
		}
	}

	@Override
	public void close() throws IOException {
		in.close();
		out.close();
	}

	static class InputReader {
		public BufferedReader reader;
		public StringTokenizer tokenizer;

		public InputReader(InputStream stream) {
			reader = new BufferedReader(new InputStreamReader(stream), 32768);
			tokenizer = null;
		}

		public String next() {
			while (tokenizer == null || !tokenizer.hasMoreTokens()) {
				try {
					tokenizer = new StringTokenizer(reader.readLine());
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
			return tokenizer.nextToken();
		}

		public int nextInt() {
			return Integer.parseInt(next());
		}

		public long nextLong() {
			return Long.parseLong(next());
		}

		public void close() throws IOException {
			reader.close();
		}
	}

	public static void main(String[] args) throws IOException {
		try (CatsAndDogs instance = new CatsAndDogs()) {
			instance.solve();
		}
	}
}
