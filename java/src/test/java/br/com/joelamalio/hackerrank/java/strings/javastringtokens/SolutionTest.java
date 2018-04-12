package br.com.joelamalio.hackerrank.java.strings.javastringtokens;

import java.io.ByteArrayInputStream;

import org.junit.Assert;
import org.junit.Test;

import br.com.joelamalio.hackerrank.java.util.TestConsoleAb;

public class SolutionTest extends TestConsoleAb {
	
	@Test
	public void testCase0() {
		input("He is a very very good boy, isn't he?");
		inContent = new ByteArrayInputStream(input.toString().getBytes());
		System.setIn(inContent);
		
		Solution.main(new String[]{});
		output("10");
		output("He");
		output("is");
		output("a");
		output("very");
		output("very");
		output("good");
		output("boy");
		output("isn");
		output("t");
		output("he");
		Assert.assertEquals(output.toString(), outContent.toString());
	}
	
	@Test
	public void testCase1() {
		input("Hello, thanks for attempting this problem! Hope it will help you to learn java! Good luck and have a nice day!");
		inContent = new ByteArrayInputStream(input.toString().getBytes());
		System.setIn(inContent);
		
		Solution.main(new String[]{});
		output("21");
		output("Hello");
		output("thanks");
		output("for");
		output("attempting");
		output("this");
		output("problem");
		output("Hope");
		output("it");
		output("will");
		output("help");
		output("you");
		output("to");
		output("learn");
		output("java");
		output("Good");
		output("luck");
		output("and");
		output("have");
		output("a");
		output("nice");
		output("day");
		Assert.assertEquals(output.toString(), outContent.toString());
	}
	
	@Test
	public void testCase2() {
		input("Its always better if you find edge cases by yourself rather than buying test cases with valuable hackos!!   May be this case won't help you to find the   buuuuuug  ");
		inContent = new ByteArrayInputStream(input.toString().getBytes());
		System.setIn(inContent);
		
		Solution.main(new String[]{});
		output("30");
		output("Its");
		output("always");
		output("better");
		output("if");
		output("you");
		output("find");
		output("edge");
		output("cases");
		output("by");
		output("yourself");
		output("rather");
		output("than");
		output("buying");
		output("test");
		output("cases");
		output("with");
		output("valuable");
		output("hackos");
		output("May");
		output("be");
		output("this");
		output("case");
		output("won");
		output("t");
		output("help");
		output("you");
		output("to");
		output("find");
		output("the");
		output("buuuuuug");
		Assert.assertEquals(output.toString(), outContent.toString());
	}
	
	@Test
	public void testCase3() {
		input("           YES      leading spaces        are valid,    problemsetters are         evillllll");
		inContent = new ByteArrayInputStream(input.toString().getBytes());
		System.setIn(inContent);
		
		Solution.main(new String[]{});
		output("8");
		output("YES");
		output("leading");
		output("spaces");
		output("are");
		output("valid");
		output("problemsetters");
		output("are");
		output("evillllll");
		Assert.assertEquals(output.toString(), outContent.toString());
	}
	
	@Test
	public void testCase4() {
		input("Good luck with this case!!! h jrkjc c l m e i vct h ss pqk_v i olf tuoej_          p r jrpjpuo a.          udc mu tk g dc,          j o mui brljn!jv p rsklqu p?a lv l n dl quo!cml pld qf l s!          t nb ud j etc q           a j f ugc eer c,          ci de lm p iwk_nwa e su s u ga.l w xlkod f e v_          oo ukaa v t xe.          j cl vmh hi tl!          xa aw ugeibo?c r oo v qte ri,          elbf ibg qk i_m nm s ainis s           u m rhd fgi h v!          mji tu oj t c d.x hxtp a bf xj.          l j ela wuj is           pj gu fs e o v i,s s i b k kab tw@          im c vlud k ki!          e ft gpcf t g k'          m c r snv w b rw,hwoh dfl hn u@cb ep ucsse j_          a d h q p w q rjp_          tln j vofvwg_sj rx pur l dx_          vo b lk sljnm?          k xox i cv va l,          du toe sdwx g@c s uded gw od!          tqsv v t v fnl'          o amka ll x s q_          a frs s ltubs?wdjfdrf x jk.jgkb d s d k n m@sedwkpe ev h_icr ggqxvap@          j g hva o kja q?          j j q ra iak c u!          vqnf thfw wx!          ccn mox sp do'u r ei ifah nl'u g m qipu r c e           ws op hng fbp.          fr vle qh d fv_okcei p e oal_a nsxi g to w x!          qfvv sr cjmo_          kchrkonuc f'ush wd xptas!rfrt o llgwf?          jclpl wmt h r           rv o lhnxnbf           h fqfnla pft?n b uu tbba sl_u ij f i jox xu.ext p gs un dc           fx p o kh rl l j'nkgevg xdrq?          q s wv umu olw?jaidu ilpr e?fc qcr p htpn           g xt d d uqk cp,          cts jkg e i op_j utt rf gvm t!          qgjr r r s cpc,          m n a wde pcg v?e ioek nlc fh@ahk ei ejmp d_fq enmeoesu?          skntwnolsx!j bt bgb dhtt!          r jcl mdh i kr,          m jcl fgix gq_enpuk n g rl i?ei xedl o h e a!x wjp uge h w g'wb dg wlkxli qi x ff eq gbe_bakb m c p aos_vv c m labuj r!          s t oign xwn a@c ffwpic wck_          gmkahnse si!q viev a ndfg,f p utcumoxb'          kgd m n g gnk b!          i rr x x uxx g p_          af s piu hgs o?          kpmrltmrqe@s m mbjfnxq p'          g f i v l wc u ij@");
		inContent = new ByteArrayInputStream(input.toString().getBytes());
		System.setIn(inContent);
		
		Solution.main(new String[]{});
		output("475");
		output("Good");
		output("luck");
		output("with");
		output("this");
		output("case");
		output("h");
		output("jrkjc");
		output("c");
		output("l");
		output("m");
		output("e");
		output("i");
		output("vct");
		output("h");
		output("ss");
		output("pqk");
		output("v");
		output("i");
		output("olf");
		output("tuoej");
		output("p");
		output("r");
		output("jrpjpuo");
		output("a");
		output("udc");
		output("mu");
		output("tk");
		output("g");
		output("dc");
		output("j");
		output("o");
		output("mui");
		output("brljn");
		output("jv");
		output("p");
		output("rsklqu");
		output("p");
		output("a");
		output("lv");
		output("l");
		output("n");
		output("dl");
		output("quo");
		output("cml");
		output("pld");
		output("qf");
		output("l");
		output("s");
		output("t");
		output("nb");
		output("ud");
		output("j");
		output("etc");
		output("q");
		output("a");
		output("j");
		output("f");
		output("ugc");
		output("eer");
		output("c");
		output("ci");
		output("de");
		output("lm");
		output("p");
		output("iwk");
		output("nwa");
		output("e");
		output("su");
		output("s");
		output("u");
		output("ga");
		output("l");
		output("w");
		output("xlkod");
		output("f");
		output("e");
		output("v");
		output("oo");
		output("ukaa");
		output("v");
		output("t");
		output("xe");
		output("j");
		output("cl");
		output("vmh");
		output("hi");
		output("tl");
		output("xa");
		output("aw");
		output("ugeibo");
		output("c");
		output("r");
		output("oo");
		output("v");
		output("qte");
		output("ri");
		output("elbf");
		output("ibg");
		output("qk");
		output("i");
		output("m");
		output("nm");
		output("s");
		output("ainis");
		output("s");
		output("u");
		output("m");
		output("rhd");
		output("fgi");
		output("h");
		output("v");
		output("mji");
		output("tu");
		output("oj");
		output("t");
		output("c");
		output("d");
		output("x");
		output("hxtp");
		output("a");
		output("bf");
		output("xj");
		output("l");
		output("j");
		output("ela");
		output("wuj");
		output("is");
		output("pj");
		output("gu");
		output("fs");
		output("e");
		output("o");
		output("v");
		output("i");
		output("s");
		output("s");
		output("i");
		output("b");
		output("k");
		output("kab");
		output("tw");
		output("im");
		output("c");
		output("vlud");
		output("k");
		output("ki");
		output("e");
		output("ft");
		output("gpcf");
		output("t");
		output("g");
		output("k");
		output("m");
		output("c");
		output("r");
		output("snv");
		output("w");
		output("b");
		output("rw");
		output("hwoh");
		output("dfl");
		output("hn");
		output("u");
		output("cb");
		output("ep");
		output("ucsse");
		output("j");
		output("a");
		output("d");
		output("h");
		output("q");
		output("p");
		output("w");
		output("q");
		output("rjp");
		output("tln");
		output("j");
		output("vofvwg");
		output("sj");
		output("rx");
		output("pur");
		output("l");
		output("dx");
		output("vo");
		output("b");
		output("lk");
		output("sljnm");
		output("k");
		output("xox");
		output("i");
		output("cv");
		output("va");
		output("l");
		output("du");
		output("toe");
		output("sdwx");
		output("g");
		output("c");
		output("s");
		output("uded");
		output("gw");
		output("od");
		output("tqsv");
		output("v");
		output("t");
		output("v");
		output("fnl");
		output("o");
		output("amka");
		output("ll");
		output("x");
		output("s");
		output("q");
		output("a");
		output("frs");
		output("s");
		output("ltubs");
		output("wdjfdrf");
		output("x");
		output("jk");
		output("jgkb");
		output("d");
		output("s");
		output("d");
		output("k");
		output("n");
		output("m");
		output("sedwkpe");
		output("ev");
		output("h");
		output("icr");
		output("ggqxvap");
		output("j");
		output("g");
		output("hva");
		output("o");
		output("kja");
		output("q");
		output("j");
		output("j");
		output("q");
		output("ra");
		output("iak");
		output("c");
		output("u");
		output("vqnf");
		output("thfw");
		output("wx");
		output("ccn");
		output("mox");
		output("sp");
		output("do");
		output("u");
		output("r");
		output("ei");
		output("ifah");
		output("nl");
		output("u");
		output("g");
		output("m");
		output("qipu");
		output("r");
		output("c");
		output("e");
		output("ws");
		output("op");
		output("hng");
		output("fbp");
		output("fr");
		output("vle");
		output("qh");
		output("d");
		output("fv");
		output("okcei");
		output("p");
		output("e");
		output("oal");
		output("a");
		output("nsxi");
		output("g");
		output("to");
		output("w");
		output("x");
		output("qfvv");
		output("sr");
		output("cjmo");
		output("kchrkonuc");
		output("f");
		output("ush");
		output("wd");
		output("xptas");
		output("rfrt");
		output("o");
		output("llgwf");
		output("jclpl");
		output("wmt");
		output("h");
		output("r");
		output("rv");
		output("o");
		output("lhnxnbf");
		output("h");
		output("fqfnla");
		output("pft");
		output("n");
		output("b");
		output("uu");
		output("tbba");
		output("sl");
		output("u");
		output("ij");
		output("f");
		output("i");
		output("jox");
		output("xu");
		output("ext");
		output("p");
		output("gs");
		output("un");
		output("dc");
		output("fx");
		output("p");
		output("o");
		output("kh");
		output("rl");
		output("l");
		output("j");
		output("nkgevg");
		output("xdrq");
		output("q");
		output("s");
		output("wv");
		output("umu");
		output("olw");
		output("jaidu");
		output("ilpr");
		output("e");
		output("fc");
		output("qcr");
		output("p");
		output("htpn");
		output("g");
		output("xt");
		output("d");
		output("d");
		output("uqk");
		output("cp");
		output("cts");
		output("jkg");
		output("e");
		output("i");
		output("op");
		output("j");
		output("utt");
		output("rf");
		output("gvm");
		output("t");
		output("qgjr");
		output("r");
		output("r");
		output("s");
		output("cpc");
		output("m");
		output("n");
		output("a");
		output("wde");
		output("pcg");
		output("v");
		output("e");
		output("ioek");
		output("nlc");
		output("fh");
		output("ahk");
		output("ei");
		output("ejmp");
		output("d");
		output("fq");
		output("enmeoesu");
		output("skntwnolsx");
		output("j");
		output("bt");
		output("bgb");
		output("dhtt");
		output("r");
		output("jcl");
		output("mdh");
		output("i");
		output("kr");
		output("m");
		output("jcl");
		output("fgix");
		output("gq");
		output("enpuk");
		output("n");
		output("g");
		output("rl");
		output("i");
		output("ei");
		output("xedl");
		output("o");
		output("h");
		output("e");
		output("a");
		output("x");
		output("wjp");
		output("uge");
		output("h");
		output("w");
		output("g");
		output("wb");
		output("dg");
		output("wlkxli");
		output("qi");
		output("x");
		output("ff");
		output("eq");
		output("gbe");
		output("bakb");
		output("m");
		output("c");
		output("p");
		output("aos");
		output("vv");
		output("c");
		output("m");
		output("labuj");
		output("r");
		output("s");
		output("t");
		output("oign");
		output("xwn");
		output("a");
		output("c");
		output("ffwpic");
		output("wck");
		output("gmkahnse");
		output("si");
		output("q");
		output("viev");
		output("a");
		output("ndfg");
		output("f");
		output("p");
		output("utcumoxb");
		output("kgd");
		output("m");
		output("n");
		output("g");
		output("gnk");
		output("b");
		output("i");
		output("rr");
		output("x");
		output("x");
		output("uxx");
		output("g");
		output("p");
		output("af");
		output("s");
		output("piu");
		output("hgs");
		output("o");
		output("kpmrltmrqe");
		output("s");
		output("m");
		output("mbjfnxq");
		output("p");
		output("g");
		output("f");
		output("i");
		output("v");
		output("l");
		output("wc");
		output("u");
		output("ij");
		Assert.assertEquals(output.toString(), outContent.toString());
	}
	
	@Test
	public void testCase9() {
		input("                        ");
		inContent = new ByteArrayInputStream(input.toString().getBytes());
		System.setIn(inContent);
		
		Solution.main(new String[]{});
		output("0");
		Assert.assertEquals(output.toString(), outContent.toString());
	}
}
