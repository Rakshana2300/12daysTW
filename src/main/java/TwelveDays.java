import java.util.*;
class TwelveDays {
    Map<Integer,String> numberToWord = new HashMap<Integer,String>();
    Map<Integer,String> song = new HashMap<Integer,String>();
    Map<Integer,String> verses = new HashMap<Integer,String>();
    String numberToWord(int verseNumber){
        switch(verseNumber){
            case 1: numberToWord.put(verseNumber,"first"); break;
            case 2: numberToWord.put(verseNumber,"second"); break;
            case 3: numberToWord.put(verseNumber,"third"); break;
            case 4: numberToWord.put(verseNumber,"fourth"); break;
            case 5: numberToWord.put(verseNumber,"fifth"); break;
            case 6: numberToWord.put(verseNumber,"sixth"); break;
            case 7: numberToWord.put(verseNumber,"seventh"); break;
            case 8: numberToWord.put(verseNumber,"eighth"); break;
            case 9: numberToWord.put(verseNumber,"ninth"); break;
            case 10: numberToWord.put(verseNumber,"tenth"); break;
            case 11: numberToWord.put(verseNumber,"eleventh"); break;
            case 12: numberToWord.put(verseNumber,"twelfth"); break;
            default:break;
        }
        return numberToWord.get(verseNumber);
    }
    String song(int verseNumber){
        switch(verseNumber){
            case 1: song.put(verseNumber,"a Partridge in a Pear Tree.\n"); break;
            case 2: song.put(verseNumber,"two Turtle Doves, and a Partridge in a Pear Tree.\n"); break;
            case 3: song.put(verseNumber,"three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n"); break;
            case 4: song.put(verseNumber,"four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n"); break;
            case 5: song.put(verseNumber,"five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n"); break;
            case 6: song.put(verseNumber,"six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n"); break;
            case 7: song.put(verseNumber,"seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n"); break;
            case 8: song.put(verseNumber,"eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n"); break;
            case 9: song.put(verseNumber,"nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n"); break;
            case 10: song.put(verseNumber,"ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n"); break;
            case 11: song.put(verseNumber,"eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n"); break;
            case 12: song.put(verseNumber,"twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n"); break;
            default:break;
        }
        return song.get(verseNumber);
    }
    String verse(int verseNumber) {
        String verse = "";
        if(!verses.containsKey(verseNumber)){
            String day = "";
            if(numberToWord.containsKey(verseNumber)){
                day = numberToWord.get(verseNumber);
            }
            else{
                day = numberToWord(verseNumber);
            }
            String phrase = "";
            if(song.containsKey(verseNumber)){
                phrase = song.get(verseNumber);
            }
            else{
                phrase = song(verseNumber);
            }
            verse = "On the "+day+" day of Christmas my true love gave to me: "+phrase;
            verses.put(verseNumber,verse);
        }
        else{
            verse = verses.get(verseNumber);
        }
        return verse;
        
    }

    String verses(int startVerse, int endVerse) {
        String combinedVerses = "";
        for(int verseNumber = startVerse; verseNumber<=endVerse; verseNumber++){
            if(verses.containsKey(verseNumber)){
                combinedVerses+=verses.get(verseNumber);
            }
            else{
                combinedVerses+=verse(verseNumber);
            }
            if(verseNumber!=endVerse)
                combinedVerses+="\n";
        }
        return combinedVerses;
    }
    
    String sing() {
        return verses(1,12);
    }
}
