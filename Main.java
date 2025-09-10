/**
 * Main.java - Driver class to demonstrate revised historical examples
 * 
 * @author Jeff Peterson
 * @version 4
 * 
+--------------------------------------------------------------+
|                           Main                               |
+--------------------------------------------------------------+
| + main(args:String[]) : void                                 |
+--------------------------------------------------------------+
*/

public class Main {
	public static void main(String[] args) {
/**
		 String tulsaDescription = "A black teenager, who was working as a shoe shiner in downtown Tulsa, Oklahoma, was arrested and accused of assaulting a white woman on a public elevator in broad daylight. A group of white vigilantes, intent on lynching him, and armed black men intent on protecting him gathered at the courthouse. A shot rang out, and the violence began. The riot resulted in 35 square blocks of destruction, including more than 1,250 homes, churches, schools, businesses, a hospital, and a library.";
		Date tulsaDay = new Date(5, 31, 1921);
		HistoricalEvent tulsaRiot = new HistoricalEvent(tulsaDescription, tulsaDay);

		System.out.println("====================================================");
		System.out.println("HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		System.out.println(tulsaRiot);
		
		String tulsaRevised = "It started with newspaper reports that a black man had assaulted a white elevator operator. He was arrested, and black World War I vets rushed to the courthouse to prevent a lynching. Whites were deputized and handed weapons, the shooting started and then it got out of hand. It was mob rule for two days, and the result was the complete devastation of the entire black community. The white mobs looted the homes and businesses before they set fire to the community. Planes circled mid-air and bombed what was known as Black Wall Street. The National Guard was called out after the governor declared martial law, and imprisoned all blacks that were not already in jail. More than 35 blocks were destroyed, along with more than 1,200 homes, and some 300 people died, mostly Blacks.",
			tulsaCitation = "https://www.smithsonianmag.com/smithsonian-institution/long-lost-manuscript-contains-searing-eyewitness-account-tulsa-race-massacre-1921-180959251/";
		RevisedHistoricalEvent tulsaMassacre = new RevisedHistoricalEvent(tulsaDescription, tulsaDay,
			tulsaRevised, tulsaCitation);
		
		System.out.println("\n====================================================");
		System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
		System.out.println("====================================================");
		tulsaMassacre.teach();
*/
		// Japanese American incarceration — original telling
        String japaneseDescription = "After Pearl Harbor, the U.S. government ordered the removal of people of Japanese ancestry from the West Coast for supposed security reasons.";
        Date japaneseDate = new Date(2, 19, 1942);
		HistoricalEvent japaneseEvent = new HistoricalEvent(japaneseDescription, japaneseDate);
		
        System.out.println("====================================================");
        System.out.println("HISTORICAL EVENT: JAPANESE AMERICAN INCARCERATION");
        System.out.println("====================================================");
		System.out.println(japaneseEvent);
		
		// Japanese American incarceration — original telling
        String japaneseRevised =
			"The U.S. government forcibly removed about 120,000 people of Japanese descent—two-thirds of whom were U.S. citizens—from the West Coast in 1942 under Executive Order 9066. They were incarcerated without due process in remote camps. There was no proven military necessity; decisions were driven by racial prejudice and wartime hysteria. A 1983 federal commission concluded the incarceration was unjustified, and in 1988 the U.S. government issued an apology and paid reparations.",
			japaneseCitation = "National Archives: https://www.archives.gov/research/japanese-americans/internment \n"
			+ "Densho Encyclopedia: https://encyclopedia.densho.org/history/";

        RevisedHistoricalEvent japaneseIncarceration =
			new RevisedHistoricalEvent(japaneseDescription, japaneseDate, japaneseRevised, japaneseCitation);
			
        System.out.println("\n====================================================");
        System.out.println("REVISED HISTORICAL EVENT: JAPANESE AMERICAN INCARCERATION:");
        System.out.println("====================================================");
        japaneseIncarceration.teach();
	}
}