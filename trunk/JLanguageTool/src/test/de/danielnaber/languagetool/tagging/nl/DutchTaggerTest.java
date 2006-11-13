package de.danielnaber.languagetool.tagging.nl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import junit.framework.TestCase;
import de.danielnaber.languagetool.AnalyzedTokenReadings;
import de.danielnaber.languagetool.tokenizers.WordTokenizer;

public class DutchTaggerTest extends TestCase {
    private DutchTagger tagger;
      private WordTokenizer tokenizer;
      
      public void setUp() {
        tagger = new DutchTagger();
        tokenizer = new WordTokenizer();
      }

      public void testTagger() throws IOException {
        myAssert("De boot is zelfgemaakt.", "De/[De]1/2-adjective(both(adv))|De/[De]1/2-determiner(pron)|De/[De]1/2-noun(both,both,[])|De/[De]1/2-noun(both,pl,[])|De/[De]1/2-noun(de,sg,[])|De/[De]1/2-noun(het,sg,[])|De/[De]1/2-pronoun(nwh,thi,sg,both,both,def)|De/[De]1/2-pronoun(nwh,thi,sg,de,both,def)|De/[De]1/2-propername|De/[De]1/2-skip|De/[De]1/2-tmpnp|De/[De]1/3-determiner(plnum,nwh,nmod,pro,yparg)|De/[De]1/3-determiner(pron)|De/[De]1/3-noun(both,both,[])|De/[De]1/3-noun(de,sg,[])|De/[De]1/3-propername|De/[De]1/4-determiner(de)|De/[De]1/4-propername|De/[De]1/5-propername|De/[De]1/6-propername|De/[De]1/7-propername|De/[De]1/8-propername|De/[De]2/2-noun(both,both,[])|De/[De]2/3-determiner(pron)|De/[De]2/3-noun(both,both,[])|De/[De]2/3-propername|De/[De]2/4-propername|De/[De]2/5-propername|De/[De]2/6-propername|De/[De]2/7-propername|De/[De]2/8-propername|De/[De]3/3-noun(both,both,[])|De/[De]3/4-propername|De/[De]3/5-propername|De/[De]3/6-propername|De/[De]3/7-propername|De/[De]3/8-propername|De/[De]4/5-propername|De/[De]4/6-propername|De/[De]4/7-propername|De/[De]4/8-propername|De/[De]5/6-propername|De/[De]5/7-propername|De/[De]6/7-propername|De/[De]6/8-propername|De/[De]7/8-propername|De/[De]8/9-propername|De/[De]9/10-propername|De/[De]determiner(de)|De/[de]1/2-adjective(both(adv))|De/[de]1/2-adjective(meer)|De/[de]1/2-determiner(de,nwh,mod,pro,yparg)|De/[de]1/2-determiner(het,nwh,nmod,pro,nparg,wkpro)|De/[de]1/2-fixedpart([de,baas])|De/[de]1/2-fixedpart([de,beest])|De/[de]1/2-fixedpart([de,benen])|De/[de]1/2-fixedpart([de,beurt])|De/[de]1/2-fixedpart([de,blits])|De/[de]1/2-fixedpart([de,deur])|De/[de]1/2-fixedpart([de,draak])|De/[de]1/2-fixedpart([de,hand])|De/[de]1/2-fixedpart([de,huid])|De/[de]1/2-fixedpart([de,kaas])|De/[de]1/2-fixedpart([de,keel])|De/[de]1/2-fixedpart([de,kneep])|De/[de]1/2-fixedpart([de,loef])|De/[de]1/2-fixedpart([de,loftrompet])|De/[de]1/2-fixedpart([de,longen])|De/[de]1/2-fixedpart([de,man])|De/[de]1/2-fixedpart([de,mantel])|De/[de]1/2-fixedpart([de,mond])|De/[de]1/2-fixedpart([de,neus])|De/[de]1/2-fixedpart([de,ogen])|De/[de]1/2-fixedpart([de,pest])|De/[de]1/2-fixedpart([de,ronde])|De/[de]1/2-fixedpart([de,schoen])|De/[de]1/2-fixedpart([de,show])|De/[de]1/2-fixedpart([de,smoor])|De/[de]1/2-fixedpart([de,strot])|De/[de]1/2-fixedpart([de,tijd])|De/[de]1/2-fixedpart([de,voet])|De/[de]1/2-noun(both,pl,[])|De/[de]1/2-noun(de,sg,[])|De/[de]1/2-noun(het,sg,[])|De/[de]1/2-np|De/[de]1/2-pronoun(nwh,inv,both,de,nom,def)|De/[de]1/2-pronoun(nwh,inv,sg,both,both,def)|De/[de]1/2-pronoun(nwh,thi,pl,de,both,def)|De/[de]1/2-pronoun(nwh,thi,sg,both,both,def)|De/[de]1/2-pronoun(nwh,thi,sg,de,both,def)|De/[de]1/2-propername|De/[de]1/2-tmpnp|De/[de]1/2-whadjective(odetadv)|De/[de]1/3-determiner(plnum,nwh,nmod,pro,yparg)|De/[de]1/3-propername|De/[de]1/3-sentenceadverb|De/[de]1/4-determiner(de)|De/[de]1/4-propername|De/[de]1/5-fixedpart([de,stuipen,op,het,lijf])|De/[de]1/5-propername|De/[de]1/6-propername|De/[de]1/7-propername|De/[de]2/10-propername|De/[de]2/2-prenumadv(plindef)|De/[de]2/2-propername|De/[de]2/2-skip|De/[de]2/3-adjective(e)|De/[de]2/3-adjective(pred(nonadv))|De/[de]2/3-adjective(pred(padv))|De/[de]2/3-adverb|De/[de]2/3-determiner(pron)|De/[de]2/3-fixedpart([aan,de,dag])|De/[de]2/3-fixedpart([aan,de,hand])|De/[de]2/3-fixedpart([aan,de,kaak])|De/[de]2/3-fixedpart([aan,de,leiding])|De/[de]2/3-fixedpart([aan,de,lippen])|De/[de]2/3-fixedpart([aan,de,man])|De/[de]2/3-fixedpart([aan,de,orde])|De/[de]2/3-fixedpart([aan,de,tand])|De/[de]2/3-fixedpart([aan,de,weet])|De/[de]2/3-fixedpart([aan,de,weg])|De/[de]2/3-fixedpart([achter,de,rug])|De/[de]2/3-fixedpart([als,de,dood])|De/[de]2/3-fixedpart([bij,de,keel])|De/[de]2/3-fixedpart([door,de,beugel])|De/[de]2/3-fixedpart([door,de,mand])|De/[de]2/3-fixedpart([in,de,aarde])|De/[de]2/3-fixedpart([in,de,arm])|De/[de]2/3-fixedpart([in,de,bedoeling])|De/[de]2/3-fixedpart([in,de,gaten])|De/[de]2/3-fixedpart([in,de,gelegenheid])|De/[de]2/3-fixedpart([in,de,haren])|De/[de]2/3-fixedpart([in,de,kaart])|De/[de]2/3-fixedpart([in,de,knoop])|De/[de]2/3-fixedpart([in,de,lijn])|De/[de]2/3-fixedpart([in,de,lucht])|De/[de]2/3-fixedpart([in,de,ogen])|De/[de]2/3-fixedpart([in,de,papieren])|De/[de]2/3-fixedpart([in,de,pas])|De/[de]2/3-fixedpart([in,de,rede])|De/[de]2/3-fixedpart([in,de,schoenen])|De/[de]2/3-fixedpart([in,de,smiezen])|De/[de]2/3-fixedpart([in,de,steek])|De/[de]2/3-fixedpart([in,de,wacht])|De/[de]2/3-fixedpart([in,de,war])|De/[de]2/3-fixedpart([in,de,weg])|De/[de]2/3-fixedpart([in,de,wind])|De/[de]2/3-fixedpart([naar,de,keel])|De/[de]2/3-fixedpart([naar,de,klote])|De/[de]2/3-fixedpart([naar,de,knoppen])|De/[de]2/3-fixedpart([onder,de,knie])|De/[de]2/3-fixedpart([onder,de,nagels])|De/[de]2/3-fixedpart([onder,de,neus])|De/[de]2/3-fixedpart([onder,de,riem])|De/[de]2/3-fixedpart([onder,de,voet])|De/[de]2/3-fixedpart([onderuit,de,zak])|De/[de]2/3-fixedpart([op,de,been])|De/[de]2/3-fixedpart([op,de,borst])|De/[de]2/3-fixedpart([op,de,kast])|De/[de]2/3-fixedpart([op,de,keel])|De/[de]2/3-fixedpart([op,de,knieën])|De/[de]2/3-fixedpart([op,de,koop])|De/[de]2/3-fixedpart([op,de,kop])|De/[de]2/3-fixedpart([op,de,korrel])|De/[de]2/3-fixedpart([op,de,loer])|De/[de]2/3-fixedpart([op,de,markt])|De/[de]2/3-fixedpart([op,de,nominatie])|De/[de]2/3-fixedpart([op,de,vingers])|De/[de]2/3-fixedpart([op,de,vlucht])|De/[de]2/3-fixedpart([over,de,brug])|De/[de]2/3-fixedpart([over,de,schreef])|De/[de]2/3-fixedpart([over,de,toonbank])|De/[de]2/3-fixedpart([tegen,de,borst])|De/[de]2/3-fixedpart([tot,de,lippen])|De/[de]2/3-fixedpart([uit,de,bus])|De/[de]2/3-fixedpart([uit,de,grond])|De/[de]2/3-fixedpart([uit,de,hand])|De/[de]2/3-fixedpart([uit,de,mond])|De/[de]2/3-fixedpart([uit,de,sloffen])|De/[de]2/3-fixedpart([uit,de,verf])|De/[de]2/3-fixedpart([uit,de,voeten])|De/[de]2/3-fixedpart([uit,de,weg])|De/[de]2/3-fixedpart([van,de,domme])|De/[de]2/3-fixedpart([van,de,hand])|De/[de]2/3-fixedpart([voor,de,dag])|De/[de]2/3-fixedpart([voor,de,deur])|De/[de]2/3-fixedpart([voor,de,geest])|De/[de]2/3-fixedpart([voor,de,ogen])|De/[de]2/3-fixedpart([voor,de,voeten])|De/[de]2/3-fixedpart([voor,de,wind])|De/[de]2/3-noun(both,pl,[])|De/[de]2/3-noun(both,sg,[])|De/[de]2/3-noun(de,sg,[])|De/[de]2/3-noun(het,sg,[])|De/[de]2/3-np|De/[de]2/3-number(hoofd(plnum))|De/[de]2/3-particle([in,de,plaats])|De/[de]2/3-pp|De/[de]2/3-propername|De/[de]2/3-sentenceadverb|De/[de]2/4-determiner(pron)|De/[de]2/4-eradverb([aan,de,hand,van])|De/[de]2/4-eradverb([aan,de,vooravond,van])|De/[de]2/4-fixedpart([in,de,koude,kleren])|De/[de]2/4-fixedpart([in,de,kouwe,kleren])|De/[de]2/4-fixedpart([op,de,koop,toe])|De/[de]2/4-fixedpart([op,de,lange,baan])|De/[de]2/4-noun(both,sg,[])|De/[de]2/4-noun(de,sg,[])|De/[de]2/4-noun(het,sg,[])|De/[de]2/4-preposition([aan,de,hand,van],[])|De/[de]2/4-preposition([aan,de,vooravond,van],[])|De/[de]2/4-preposition([bij,de,gratie,van],[])|De/[de]2/4-preposition([in,de,aanloop,naar],[])|De/[de]2/4-preposition([in,de,geest,van],[])|De/[de]2/4-preposition([in,de,hitte,van],[])|De/[de]2/4-preposition([in,de,loop,van],[])|De/[de]2/4-preposition([in,de,loop,van],[],tmpadv)|De/[de]2/4-preposition([in,de,persoon,van],[])|De/[de]2/4-propername|De/[de]2/4-sentenceadverb|De/[de]2/4-waaradverb([aan,de,hand,van])|De/[de]2/5-fixedpart([in,de,lijn,der,verwachting])|De/[de]2/5-fixedpart([in,de,lijn,der,verwachtingen])|De/[de]2/5-number(hoofd(plnum))|De/[de]2/5-propername|De/[de]2/6-number(hoofd(plnum))|De/[de]2/6-propername|De/[de]2/7-number(hoofd(plnum))|De/[de]2/7-propername|De/[de]2/8-propername|De/[de]2/9-propername|De/[de]3/10-propername|De/[de]3/3-propername|De/[de]3/4-determiner(de)|De/[de]3/4-determiner(pron)|De/[de]3/4-eradverb(voor)|De/[de]3/4-fixedpart([na,aan,de,schenen])|De/[de]3/4-noun(both,pl,[])|De/[de]3/4-noun(de,sg,[])|De/[de]3/4-noun(het,sg,[])|De/[de]3/4-np|De/[de]3/4-preposition(voor,[],extractednp)|De/[de]3/4-propername|De/[de]3/5-determiner(pron)|De/[de]3/5-modaladverb|De/[de]3/5-noun(de,sg,[])|De/[de]3/5-propername|De/[de]3/6-propername|De/[de]3/7-propername|De/[de]3/8-propername|De/[de]3/9-propername|De/[de]4/4-propername|De/[de]4/5-determiner(pron)|De/[de]4/5-fixedpart([drie,slagen,in,de,rondte])|De/[de]4/5-fixedpart([een,slag,in,de,rondte])|De/[de]4/5-noun(de,sg,[])|De/[de]4/5-propername|De/[de]4/6-noun(de,sg,[])|De/[de]4/6-propername|De/[de]4/7-propername|De/[de]4/8-propername|De/[de]4/9-propername|De/[de]5/10-propername|De/[de]5/6-noun(de,sg,[])|De/[de]5/6-number(hoofd(plnum))|De/[de]5/6-propername|De/[de]5/7-propername|De/[de]5/8-propername|De/[de]5/9-propername|De/[de]6/10-propername|De/[de]6/7-propername|De/[de]6/8-propername|De/[de]6/9-propername|De/[de]7/8-propername|De/[de]7/9-propername|De/[de]8/9-propername|De/[de]9/10-propername|De/[de]determiner(de)|De/[de]propername|De/[de]skip boot/[boot]noun(de,sg,[]) is/[is]1/4-propername|is/[is]1/7-propername|is/[is]2/2-determiner(pron)|is/[is]2/2-propername|is/[is]2/3-max|is/[is]2/3-propername|is/[is]2/3-sentenceadverb|is/[is]2/4-propername|is/[is]2/5-propername|is/[is]2/6-propername|is/[is]2/7-propername|is/[is]2/8-propername|is/[is]3/3-determiner(pron)|is/[is]3/3-propername|is/[is]3/4-propername|is/[is]3/5-max|is/[is]3/5-propername|is/[is]3/6-propername|is/[is]3/7-propername|is/[is]3/8-propername|is/[is]3/9-propername|is/[is]4/4-determiner(pron)|is/[is]4/4-propername|is/[is]4/5-propername|is/[is]4/6-propername|is/[is]4/7-propername|is/[is]5/5-propername|is/[is]5/6-propername|is/[is]5/7-propername|is/[is]6/6-propername|is/[is]6/6-sentenceadverb|is/[is]6/7-propername|is/[is]7/7-propername|is/[is]skip|is/[is]verb(sgheeft) zelfgemaakt/[zelfgemaakt]adjective(noe(nonadv))");        
        myAssert("blablabla","blablabla/[blablabla]noun(both,both,[])");        
      }

      private void myAssert(String input, String expected) throws IOException {
        List tokens = tokenizer.tokenize(input);
        List<String> noWhitespaceTokens = new ArrayList<String>();
        // whitespace confuses tagger, so give it the tokens but no whitespace tokens:
        for (Iterator iterator = tokens.iterator(); iterator.hasNext();) {
          String token = (String) iterator.next();
          if (isWord(token)) {
            noWhitespaceTokens.add(token);
          }
        }
        List output = tagger.tag(noWhitespaceTokens);
        StringBuffer outputStr = new StringBuffer();
        for (Iterator iter = output.iterator(); iter.hasNext();) {
          AnalyzedTokenReadings token = (AnalyzedTokenReadings) iter.next();
          int readingsNumber = token.getReadingsLength();
          for (int j = 0; j < readingsNumber; j++) {
          outputStr.append(token.getAnalyzedToken(j).getToken());
          outputStr.append("/[");
          outputStr.append(token.getAnalyzedToken(j).getLemma());
          outputStr.append("]");
          outputStr.append(token.getAnalyzedToken(j).getPOSTag());
          if (readingsNumber > 1 && j < readingsNumber - 1) {
          outputStr.append("|");
          }
          }
          if (iter.hasNext())
            outputStr.append(" ");
        }
        assertEquals(expected, outputStr.toString());
      }

      private boolean isWord(String token) {
        for (int i = 0; i < token.length(); i++) {
          char c = token.charAt(i);
          if (Character.isLetter(c) || Character.isDigit(c))
            return true;
        }
        return false;
      }

}
