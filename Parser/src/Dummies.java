/**
 * Wystawia metody, które bêd¹ wywo³ywane przez parser.
 * 
 * @author Piotr Jastrzêbski
 * 
 */
public class Dummies {
	private static boolean ifTest = true;

	/** Obs³uga tablicy symboli - przypisanie */
	public static boolean _ass(String v1, double v2) {
		SymbolTable.symbolMap.put(v1, v2);
		if (ifTest)
			System.out.println(v1 + " = " + v2);
		return true;
	}

	/** Obs³uga tablicy symboli - modyfikacja */
	public static boolean _mod(String v1, String v2, double v3) {
		if (v2.equals("+=")) {
			_put(v1, _get(v1) + v3);
		} else if (v2.equals("-=")) {
			_put(v1, _get(v1) - v3);
		} else if (v2.equals("*=")) {
			_put(v1, _get(v1) * v3);
		} else if (v2.equals("/=")) {
			_put(v1, _get(v1) / v3);
		}
		if (ifTest)
			System.out.println(v1 + " " + v2 + " " + v3);
		return true;
	}

	/** Obs³uga tablicy symboli - pobranie */
	public static double _get(String v1) {
		return SymbolTable.symbolMap.get(v1);
	}

	/** Obs³uga tablicy symboli - zapisanie */
	public static void _put(String v1, double v2) {
		SymbolTable.symbolMap.put(v1, v2);
	}

	/** Obs³uga funkcji programu - wczytanie pliku */
	public static boolean _load(String path) {
		if (ifTest)
			System.out.println("LOAD: " + path);
		return true;
	}

	/** Obs³uga funkcji programu - zapis pliku */
	public static boolean _save(String path) {
		if (ifTest)
			System.out.println("SAVE: " + path);
		return true;
	}

	/** Obs³uga funkcji programu - wskazanie postepu */
	public static boolean _progress() {
		if (ifTest)
			System.out.println("PROGRESS");
		return true;
	}

	/** Obs³uga funkcji programu - transformata Hougha (okregi) */
	public static boolean _houghC(double v1, double v2, double v3, double v4) {
		if (ifTest)
			System.out.println("houghC(" + v1 + ", " + v2 + ", " + v3 + ", "
					+ v4 + ")");
		return true;
	}

	/** Obs³uga funkcji programu - transformata Hougha (proste) */
	public static boolean _houghL(double v1, double v2, double v3, double v4,
			double v5, double v6, double v7) {
		if (ifTest)
			System.out.println("houghL(" + v1 + ", " + v2 + ", " + v3 + ", "
					+ v4 + ", " + v5 + ", " + v6 + ", " + v7 + ")");
		return true;
	}

	/** Obs³uga funkcji programu - detektor Harrisa */
	public static boolean _harris(double v1, double v2, double v3, double v4,
			boolean v5, double v6) {
		if (ifTest)
			System.out.println("harris(" + v1 + ", " + v2 + ", " + v3 + ", "
					+ v4 + ", " + v5 + ", " + v6 + ")");
		return true;
	}
}