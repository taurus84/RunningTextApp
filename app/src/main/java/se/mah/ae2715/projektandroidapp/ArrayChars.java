package se.mah.ae2715.projektandroidapp;

public class ArrayChars {

	private static Array7x7[] chars = new Array7x7[128];


    public ArrayChars() {
		chars['A'] = new Array7x7(charA);
		chars['B'] = new Array7x7(charB);
		chars['C'] = new Array7x7(charC);
		chars['D'] = new Array7x7(charD);
		chars['E'] = new Array7x7(charE);
		chars['F'] = new Array7x7(charF);
		chars['G'] = new Array7x7(charG);
		chars['H'] = new Array7x7(charH);
		chars['I'] = new Array7x7(charI);
		chars['J'] = new Array7x7(charJ);
		chars['K'] = new Array7x7(charK);
		chars['L'] = new Array7x7(charL);
		chars['M'] = new Array7x7(charM);
		chars['N'] = new Array7x7(charN);
		chars['O'] = new Array7x7(charO);
		chars['P'] = new Array7x7(charP);
		chars['Q'] = new Array7x7(charQ);
		chars['R'] = new Array7x7(charR);
		chars['S'] = new Array7x7(charS);
		chars['T'] = new Array7x7(charT);
		chars['U'] = new Array7x7(charU);
		chars['V'] = new Array7x7(charV);
		chars['W'] = new Array7x7(charW);
		chars['X'] = new Array7x7(charX);
		chars['Y'] = new Array7x7(charY);
		chars['Z'] = new Array7x7(charZ);
		chars['0'] = new Array7x7(char0);
		chars['1'] = new Array7x7(char1);
		chars['2'] = new Array7x7(char2);
		chars['3'] = new Array7x7(char3);
		chars['4'] = new Array7x7(char4);
		chars['5'] = new Array7x7(char5);
		chars['6'] = new Array7x7(char6);
		chars['7'] = new Array7x7(char7);
		chars['8'] = new Array7x7(char8);
		chars['9'] = new Array7x7(char9);
		chars[' '] = new Array7x7(SPACE1);
		chars['.'] = new Array7x7(DOT1);
		chars[','] = new Array7x7(COMMA1);
		chars['!'] = new Array7x7(EXCLAMATION1);
		chars['?'] = new Array7x7(QMARK);
		chars['"'] = new Array7x7(SCHAR);
		chars['-'] = new Array7x7(HYPHEN1);
		chars['+'] = new Array7x7(PLUS1);
		chars['_'] = new Array7x7(USCORE);
		chars['%'] = new Array7x7(PERCENT1);
		chars['&'] = new Array7x7(AND1);
		chars[':'] = new Array7x7(COLON1);
		chars[';'] = new Array7x7(SCOLON);
		chars['('] = new Array7x7(LPARAN);
		chars[')'] = new Array7x7(RPARAN);
		chars['='] = new Array7x7(EQUAL1);
		chars['['] = new Array7x7(LBRACK);
		chars[']'] = new Array7x7(RBRACK);
		chars['*'] = new Array7x7(MULTI);
		chars['{'] = new Array7x7(LCURLY);
		chars['}'] = new Array7x7(RCURLY);
		chars['@'] = new Array7x7(AT);
		chars[127] = new Array7x7(UNKNOWN1);
	}

	private static int[][] charA = {
		{ 0, 0, 1, 1, 1, 0, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 1, 1, 1, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 } };

	private static int[][] charB = { 
		{ 0, 1, 1, 1, 1, 0, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 1, 1, 1, 0, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 1, 1, 1, 0, 0 } };

	private static int[][] charC = { 
		{ 0, 0, 1, 1, 1, 1, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 }, 
		{ 0, 1, 0, 0, 0, 0, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 },
		{ 0, 0, 1, 1, 1, 1, 0 } };

	private static int[][] charD = {
		{ 0, 1, 1, 1, 1, 0, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 1, 1, 1, 0, 0 } };

	private static int[][] charE = { 
		{ 0, 1, 1, 1, 1, 1, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 }, 
		{ 0, 1, 0, 0, 0, 0, 0 },
		{ 0, 1, 1, 1, 1, 0, 0 }, 
		{ 0, 1, 0, 0, 0, 0, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 }, 
		{ 0, 1, 1, 1, 1, 1, 0 } };

	private static int[][] charF = { 
		{ 0, 1, 1, 1, 1, 1, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 },
		{ 0, 1, 1, 1, 1, 0, 0 }, 
		{ 0, 1, 0, 0, 0, 0, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 }, 
		{ 0, 1, 0, 0, 0, 0, 0 } };

	private static int[][] charG = { 
		{ 0, 0, 1, 1, 1, 1, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 }, 
		{ 0, 1, 0, 0, 0, 0, 0 },
		{ 0, 1, 0, 1, 1, 1, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 0, 1, 1, 1, 0, 0 } };

	private static int[][] charH = { 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 1, 1, 1, 1, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 } };

	private static int[][] charI = { 
		{ 0, 0, 1, 1, 1, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 }, 
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 }, 
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 }, 
		{ 0, 0, 1, 1, 1, 0, 0 } };

	private static int[][] charJ = { 
		{ 0, 0, 0, 0, 0, 1, 0 },
		{ 0, 0, 0, 0, 0, 1, 0 }, 
		{ 0, 0, 0, 0, 0, 1, 0 },
		{ 0, 0, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 0, 1, 1, 1, 0, 0 } };

	private static int[][] charK = { 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 1, 0, 0 }, 
		{ 0, 1, 0, 1, 0, 0, 0 },
		{ 0, 1, 1, 0, 0, 0, 0 },
		{ 0, 1, 0, 1, 0, 0, 0 },
		{ 0, 1, 0, 0, 1, 0, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 } };

	private static int[][] charL = { 
		{ 0, 1, 0, 0, 0, 0, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 }, 
		{ 0, 1, 0, 0, 0, 0, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 }, 
		{ 0, 1, 0, 0, 0, 0, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 }, 
		{ 0, 1, 1, 1, 1, 1, 0 } };

	private static int[][] charM = { 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 1, 0, 1, 1, 0 }, 
		{ 0, 1, 0, 1, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 } };

	private static int[][] charN = { 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 1, 0, 0, 1, 0 }, 
		{ 0, 1, 1, 1, 0, 1, 0 },
		{ 0, 1, 0, 1, 1, 1, 0 }, 
		{ 0, 1, 0, 0, 1, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 } };

	private static int[][] charO = { 
		{ 0, 0, 1, 1, 1, 0, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 0, 1, 1, 1, 0, 0 } };

	private static int[][] charP = { 
		{ 0, 1, 1, 1, 1, 0, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 1, 1, 1, 0, 0 }, 
		{ 0, 1, 0, 0, 0, 0, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 } };

	private static int[][] charQ = { 
		{ 0, 0, 1, 1, 1, 0, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 0, 1, 0, 1, 0 },
		{ 0, 1, 0, 0, 1, 1, 0 },
		{ 0, 0, 1, 1, 1, 1, 0 } };

	private static int[][] charR = { 
		{ 0, 1, 1, 1, 1, 0, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 1, 1, 1, 0, 0 },
		{ 0, 1, 0, 1, 0, 0, 0 },
		{ 0, 1, 0, 0, 1, 0, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 } };

	private static int[][] charS = { 
		{ 0, 0, 1, 1, 1, 0, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 },
		{ 0, 0, 1, 1, 1, 0, 0 }, 
		{ 0, 0, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 0, 1, 1, 1, 0, 0 } };

	private static int[][] charT = { 
		{ 0, 1, 1, 1, 1, 1, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 }, 
		{ 0, 0, 0, 1, 0, 0, 0 } };

	private static int[][] charU = {
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 0, 1, 1, 1, 0, 0 } };

	private static int[][] charV = { 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 0, 1, 0, 1, 0, 0 }, 
		{ 0, 0, 0, 1, 0, 0, 0 } };

	private static int[][] charW = { 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 1, 0, 1, 0 },
		{ 0, 1, 1, 0, 1, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 } };

	private static int[][] charX = {
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 0, 1, 0, 1, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 }, 
		{ 0, 0, 1, 0, 1, 0, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 } };

	private static int[][] charY = { 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 0, 1, 0, 1, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 } };

	private static int[][] charZ = { 
		{ 0, 1, 1, 1, 1, 1, 0 },
		{ 0, 0, 0, 0, 0, 1, 0 },
		{ 0, 0, 0, 0, 1, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 }, 
		{ 0, 0, 1, 0, 0, 0, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 }, 
		{ 0, 1, 1, 1, 1, 1, 0 } };

	private static int[][] char0 = { 
		{ 0, 0, 1, 1, 1, 0, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 0, 0, 1, 1, 0 },
		{ 0, 1, 0, 1, 0, 1, 0 },
		{ 0, 1, 1, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 0, 1, 1, 1, 0, 0 } };

	private static int[][] char1 = { 
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 1, 1, 0, 0, 0 },
		{ 0, 1, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 }, 
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 }, 
		{ 0, 1, 1, 1, 1, 1, 0 } };

	private static int[][] char2 = { 
		{ 0, 0, 1, 1, 1, 0, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 0, 0, 0, 0, 1, 0 },
		{ 0, 0, 0, 0, 1, 0, 0 }, 
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 1, 0, 0, 0, 0 },
		{ 0, 1, 1, 1, 1, 1, 0 } };

	private static int[][] char3 = { 
		{ 0, 1, 1, 1, 1, 1, 0 },
		{ 0, 0, 0, 0, 1, 0, 0 }, 
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 0, 1, 0, 0 }, 
		{ 0, 0, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 0, 1, 1, 1, 0, 0 } };

	private static int[][] char4 = {
		{ 0, 0, 0, 0, 1, 0, 0 },
		{ 0, 0, 0, 1, 1, 0, 0 },
		{ 0, 0, 1, 0, 1, 0, 0 },
		{ 0, 1, 0, 0, 1, 0, 0 }, 
		{ 0, 1, 1, 1, 1, 1, 0 },
		{ 0, 0, 0, 0, 1, 0, 0 }, 
		{ 0, 0, 0, 0, 1, 0, 0 } };

	private static int[][] char5 = { 
		{ 0, 1, 1, 1, 1, 1, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 },
		{ 0, 1, 1, 1, 1, 0, 0 },
		{ 0, 0, 0, 0, 0, 1, 0 }, 
		{ 0, 0, 0, 0, 0, 1, 0 },
		{ 0, 0, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 1, 1, 1, 0, 0 } };

	private static int[][] char6 = { 
		{ 0, 0, 0, 1, 1, 0, 0 },
		{ 0, 0, 1, 0, 0, 0, 0 },
		{ 0, 1, 0, 0, 0, 0, 0 },
		{ 0, 1, 1, 1, 1, 0, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 0, 1, 1, 1, 0, 0 } };

	private static int[][] char7 = { 
		{ 0, 1, 1, 1, 1, 1, 0 },
		{ 0, 0, 0, 0, 0, 1, 0 },
		{ 0, 0, 0, 0, 1, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 }, 
		{ 0, 0, 1, 0, 0, 0, 0 },
		{ 0, 0, 1, 0, 0, 0, 0 },
		{ 0, 0, 1, 0, 0, 0, 0 } };

	private static int[][] char8 = {
		{ 0, 0, 1, 1, 1, 0, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 0, 1, 1, 1, 0, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 0, 1, 1, 1, 0, 0 } };

	private static int[][] char9 = { 
		{ 0, 0, 1, 1, 1, 0, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 0, 1, 1, 1, 1, 0 },
		{ 0, 0, 0, 0, 0, 1, 0 },
		{ 0, 0, 0, 0, 1, 0, 0 }, 
		{ 0, 0, 1, 1, 0, 0, 0 } };
	
	private static int[][] SPACE1 = { 
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 0, 0, 0, 0, 0, 0 } };

	private static int[][] DOT1 = { 
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 1, 1, 0, 0, 0 }, 
		{ 0, 0, 1, 1, 0, 0, 0 } };

	private static int[][] COMMA1 = { 
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 0, 1, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 }, 
		{ 0, 0, 1, 0, 0, 0, 0 } };

	private static int[][] EXCLAMATION1 = { 
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 }, 
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 0, 0, 1, 0, 0, 0 } };

	private static int[][] QMARK = { 
		{ 0, 0, 1, 1, 1, 0, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 0, 0, 0, 0, 1, 0 },
		{ 0, 0, 0, 0, 1, 0, 0 }, 
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 0, 0, 1, 0, 0, 0 } };

	private static int[][] SCHAR = { 
		{ 0, 1, 0, 1, 0, 0, 0 },
		{ 0, 1, 0, 1, 0, 0, 0 },
		{ 0, 1, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 0, 0, 0, 0, 0, 0 } };

	private static int[][] HYPHEN1 = { 
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 1, 1, 1, 1, 1, 0 }, 
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 0, 0, 0, 0, 0, 0 } };

	private static int[][] PLUS1= { 
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 1, 1, 1, 1, 1, 0 }, 
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 }, 
		{ 0, 0, 0, 0, 0, 0, 0 } };

	private static int[][] USCORE = { 
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 1, 1, 1, 1, 1, 0 } };

	private static int[][] PERCENT1 = { 
		{ 0, 1, 1, 0, 0, 0, 0 },
		{ 0, 1, 1, 0, 0, 1, 0 },
		{ 0, 0, 0, 0, 1, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 }, 
		{ 0, 0, 1, 0, 0, 0, 0 },
		{ 0, 1, 0, 0, 1, 1, 0 }, 
		{ 0, 0, 0, 0, 1, 1, 0 } };

	private static int[][] AND1 = { 
		{ 0, 0, 1, 1, 0, 0, 0 },
		{ 0, 1, 0, 0, 1, 0, 0 },
		{ 0, 1, 0, 1, 0, 0, 0 },
		{ 0, 0, 1, 0, 0, 0, 0 }, 
		{ 0, 1, 0, 1, 0, 1, 0 },
		{ 0, 1, 0, 0, 1, 0, 0 }, 
		{ 0, 0, 1, 1, 0, 1, 0 } };

	private static int[][] COLON1 = { 
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 1, 1, 0, 0, 0, 0 },
		{ 0, 1, 1, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 1, 1, 0, 0, 0, 0 },
		{ 0, 1, 1, 0, 0, 0, 0 }, 
		{ 0, 0, 0, 0, 0, 0, 0 } };

	private static int[][] SCOLON = { 
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 1, 1, 0, 0, 0, 0 },
		{ 0, 1, 1, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 1, 1, 0, 0, 0, 0 },
		{ 0, 0, 1, 0, 0, 0, 0 }, 
		{ 0, 1, 0, 0, 0, 0, 0 } };

	private static int[][] LPARAN = { 
		{ 0, 0, 0, 0, 1, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 1, 0, 0, 0, 0 },
		{ 0, 0, 1, 0, 0, 0, 0 }, 
		{ 0, 0, 1, 0, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 }, 
		{ 0, 0, 0, 0, 1, 0, 0 } };
	
	private static int[][] RPARAN = { 
		{ 0, 0, 1, 0, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 0, 1, 0, 0 },
		{ 0, 0, 0, 0, 1, 0, 0 }, 
		{ 0, 0, 0, 0, 1, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 }, 
		{ 0, 0, 1, 0, 0, 0, 0 } };

	private static int[][] EQUAL1 = { 
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 },
		{ 0, 1, 1, 1, 1, 1, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 1, 1, 1, 1, 1, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 0, 0, 0, 0, 0, 0 } };

	private static int[][] LBRACK = { 
		{ 0, 0, 1, 1, 1, 0, 0 },
		{ 0, 0, 1, 0, 0, 0, 0 },
		{ 0, 0, 1, 0, 0, 0, 0 },
		{ 0, 0, 1, 0, 0, 0, 0 }, 
		{ 0, 0, 1, 0, 0, 0, 0 },
		{ 0, 0, 1, 0, 0, 0, 0 }, 
		{ 0, 0, 1, 1, 1, 0, 0 } };

	private static int[][] RBRACK = { 
		{ 0, 0, 1, 1, 1, 0, 0 },
		{ 0, 0, 0, 0, 1, 0, 0 },
		{ 0, 0, 0, 0, 1, 0, 0 },
		{ 0, 0, 0, 0, 1, 0, 0 }, 
		{ 0, 0, 0, 0, 1, 0, 0 },
		{ 0, 0, 0, 0, 1, 0, 0 }, 
		{ 0, 0, 1, 1, 1, 0, 0 } };

	private static int[][]  MULTI=  { 
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 1, 0, 1, 0, 1, 0 },
		{ 0, 0, 1, 1, 1, 0, 0 },
		{ 0, 1, 0, 1, 0, 1, 0 }, 
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 0, 0, 0, 0 }, 
		{ 0, 0, 0, 0, 0, 0, 0 } };
	
	private static int[][] LCURLY = { 
		{ 0, 0, 0, 0, 1, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 1, 0, 0, 0, 0 }, 
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 }, 
		{ 0, 0, 0, 0, 1, 0, 0 } };
	
	private static int[][] RCURLY = { 
		{ 0, 0, 1, 0, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 0, 1, 0, 0 }, 
		{ 0, 0, 0, 1, 0, 0, 0 },
		{ 0, 0, 0, 1, 0, 0, 0 }, 
		{ 0, 0, 1, 0, 0, 0, 0 } };

	private static int[][] AT = { 
		{ 0, 0, 1, 1, 1, 0, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 0, 0, 0, 0, 1, 0 },
		{ 0, 0, 1, 1, 0, 1, 0 }, 
		{ 0, 1, 0, 1, 0, 1, 0 },
		{ 0, 1, 0, 1, 0, 1, 0 }, 
		{ 0, 0, 1, 1, 1, 0, 0 } };

	private static int[][] UNKNOWN1 = {
		{ 0, 1, 1, 1, 1, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 0, 0, 0, 1, 0 },
		{ 0, 1, 0, 0, 0, 1, 0 }, 
		{ 0, 1, 1, 1, 1, 1, 0 } };



        public static Array7x7 getChar(char chr){

            if(chr >= 0 && chr <= 127){
                if(chr >= 97 && chr <= 122){
                    return chars[chr-32];
                }else if(chr == 35 || chr == 36 ||
                        chr == 39 || chr == 47 ||
                        chr == 60 || chr == 62 ||
                        chr == 92 || chr == 94 ||
                        chr == 124 || chr == 126 ) {
                    return new Array7x7(UNKNOWN1);

                }else
                    return chars[chr];
            } else
                return new Array7x7(UNKNOWN1);
        }


    }

