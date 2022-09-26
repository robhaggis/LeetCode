package easy;

public class P0383 {
	public static boolean canConstruct(String ransomNote, String magazine) {
		for (int i = 0; i < ransomNote.length(); i++) {
			String letter = Character.toString(ransomNote.charAt(i));
			if (!magazine.contains(letter)) {
				return false;
			} else {
				int location = magazine.indexOf(letter);
				String start = magazine.substring(0, location);
				String end = magazine.substring(location + 1, magazine.length());
				magazine = new String(start + end);
			}
		}
		return true;
	}

	public static void main(String[] args) {

		System.out.println(canConstruct("GIVEMEYOURMONEY", "GKJFHGKJHDFIHDFGVEMENDHDYOUHDHGDERMNDONDHDEY"));
	}
}
