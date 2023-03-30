/*
 * Copyright (c) 2012, 2023, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
*/

package sun.util.locale;

import java.util.HashMap;
import java.util.Map;

final class LocaleEquivalentMaps {

    static final Map<String, String> singleEquivMap;
    static final Map<String, String[]> multiEquivsMap;
    static final Map<String, String> regionVariantEquivMap;

    static {
        singleEquivMap = new HashMap<>(817);
        multiEquivsMap = new HashMap<>(143);
        regionVariantEquivMap = new HashMap<>(19);

        // This is an auto-generated file and should not be manually edited.
        //   LSR Revision: 2021-05-11
        singleEquivMap.put("aam", "aas");
        singleEquivMap.put("aao", "ar-aao");
        singleEquivMap.put("aas", "aam");
        singleEquivMap.put("abh", "ar-abh");
        singleEquivMap.put("abv", "ar-abv");
        singleEquivMap.put("acm", "ar-acm");
        singleEquivMap.put("acn", "xia");
        singleEquivMap.put("acq", "ar-acq");
        singleEquivMap.put("acw", "ar-acw");
        singleEquivMap.put("acx", "ar-acx");
        singleEquivMap.put("acy", "ar-acy");
        singleEquivMap.put("adf", "ar-adf");
        singleEquivMap.put("adp", "dz");
        singleEquivMap.put("ads", "sgn-ads");
        singleEquivMap.put("adx", "pcr");
        singleEquivMap.put("aeb", "ar-aeb");
        singleEquivMap.put("aec", "ar-aec");
        singleEquivMap.put("aed", "sgn-aed");
        singleEquivMap.put("aen", "sgn-aen");
        singleEquivMap.put("afb", "ar-afb");
        singleEquivMap.put("afg", "sgn-afg");
        singleEquivMap.put("ajp", "ar-ajp");
        singleEquivMap.put("ami", "i-ami");
        singleEquivMap.put("aog", "myd");
        singleEquivMap.put("apc", "ar-apc");
        singleEquivMap.put("apd", "ar-apd");
        singleEquivMap.put("ar-aao", "aao");
        singleEquivMap.put("ar-abh", "abh");
        singleEquivMap.put("ar-abv", "abv");
        singleEquivMap.put("ar-acm", "acm");
        singleEquivMap.put("ar-acq", "acq");
        singleEquivMap.put("ar-acw", "acw");
        singleEquivMap.put("ar-acx", "acx");
        singleEquivMap.put("ar-acy", "acy");
        singleEquivMap.put("ar-adf", "adf");
        singleEquivMap.put("ar-aeb", "aeb");
        singleEquivMap.put("ar-aec", "aec");
        singleEquivMap.put("ar-afb", "afb");
        singleEquivMap.put("ar-ajp", "ajp");
        singleEquivMap.put("ar-apc", "apc");
        singleEquivMap.put("ar-apd", "apd");
        singleEquivMap.put("ar-arb", "arb");
        singleEquivMap.put("ar-arq", "arq");
        singleEquivMap.put("ar-ars", "ars");
        singleEquivMap.put("ar-ary", "ary");
        singleEquivMap.put("ar-arz", "arz");
        singleEquivMap.put("ar-auz", "auz");
        singleEquivMap.put("ar-avl", "avl");
        singleEquivMap.put("ar-ayh", "ayh");
        singleEquivMap.put("ar-ayl", "ayl");
        singleEquivMap.put("ar-ayn", "ayn");
        singleEquivMap.put("ar-ayp", "ayp");
        singleEquivMap.put("ar-bbz", "bbz");
        singleEquivMap.put("ar-pga", "pga");
        singleEquivMap.put("ar-shu", "shu");
        singleEquivMap.put("ar-ssh", "ssh");
        singleEquivMap.put("arb", "ar-arb");
        singleEquivMap.put("arq", "ar-arq");
        singleEquivMap.put("ars", "ar-ars");
        singleEquivMap.put("art-lojban", "jbo");
        singleEquivMap.put("ary", "ar-ary");
        singleEquivMap.put("arz", "ar-arz");
        singleEquivMap.put("asd", "snz");
        singleEquivMap.put("asf", "sgn-asf");
        singleEquivMap.put("asp", "sgn-asp");
        singleEquivMap.put("asq", "sgn-asq");
        singleEquivMap.put("asw", "sgn-asw");
        singleEquivMap.put("aue", "ktz");
        singleEquivMap.put("auz", "ar-auz");
        singleEquivMap.put("avl", "ar-avl");
        singleEquivMap.put("ayh", "ar-ayh");
        singleEquivMap.put("ayl", "ar-ayl");
        singleEquivMap.put("ayn", "ar-ayn");
        singleEquivMap.put("ayp", "ar-ayp");
        singleEquivMap.put("ayx", "nun");
        singleEquivMap.put("bbz", "ar-bbz");
        singleEquivMap.put("bcg", "bgm");
        singleEquivMap.put("bfk", "sgn-bfk");
        singleEquivMap.put("bfy", "ppa");
        singleEquivMap.put("bgm", "bcg");
        singleEquivMap.put("bic", "bir");
        singleEquivMap.put("bir", "bic");
        singleEquivMap.put("bjd", "drl");
        singleEquivMap.put("bjn", "ms-bjn");
        singleEquivMap.put("blg", "iba");
        singleEquivMap.put("bmf", "krm");
        singleEquivMap.put("bnn", "i-bnn");
        singleEquivMap.put("bog", "sgn-bog");
        singleEquivMap.put("bpp", "nxu");
        singleEquivMap.put("bqn", "sgn-bqn");
        singleEquivMap.put("bqy", "sgn-bqy");
        singleEquivMap.put("btj", "ms-btj");
        singleEquivMap.put("bve", "ms-bve");
        singleEquivMap.put("bvl", "sgn-bvl");
        singleEquivMap.put("bvu", "ms-bvu");
        singleEquivMap.put("cax", "xba");
        singleEquivMap.put("cdo", "zh-cdo");
        singleEquivMap.put("cds", "sgn-cds");
        singleEquivMap.put("cir", "meg");
        singleEquivMap.put("cjr", "mom");
        singleEquivMap.put("cjy", "zh-cjy");
        singleEquivMap.put("cka", "cmr");
        singleEquivMap.put("cmk", "xch");
        singleEquivMap.put("cmn-hans", "zh-cmn-hans");
        singleEquivMap.put("cmn-hant", "zh-cmn-hant");
        singleEquivMap.put("cmr", "cka");
        singleEquivMap.put("cnp", "zh-cnp");
        singleEquivMap.put("coa", "ms-coa");
        singleEquivMap.put("cpx", "zh-cpx");
        singleEquivMap.put("cqu", "quh");
        singleEquivMap.put("csc", "sgn-csc");
        singleEquivMap.put("csd", "sgn-csd");
        singleEquivMap.put("cse", "sgn-cse");
        singleEquivMap.put("csf", "sgn-csf");
        singleEquivMap.put("csg", "sgn-csg");
        singleEquivMap.put("csl", "sgn-csl");
        singleEquivMap.put("csp", "zh-csp");
        singleEquivMap.put("csq", "sgn-csq");
        singleEquivMap.put("csr", "sgn-csr");
        singleEquivMap.put("csx", "sgn-csx");
        singleEquivMap.put("czh", "zh-czh");
        singleEquivMap.put("czo", "zh-czo");
        singleEquivMap.put("dev", "gav");
        singleEquivMap.put("dif", "dit");
        singleEquivMap.put("dit", "dif");
        singleEquivMap.put("dmw", "xrq");
        singleEquivMap.put("doq", "sgn-doq");
        singleEquivMap.put("drh", "khk");
        singleEquivMap.put("drl", "bjd");
        singleEquivMap.put("dup", "ms-dup");
        singleEquivMap.put("duz", "guv");
        singleEquivMap.put("dz", "adp");
        singleEquivMap.put("ecs", "sgn-ecs");
        singleEquivMap.put("ehs", "sgn-ehs");
        singleEquivMap.put("ema", "uok");
        singleEquivMap.put("en-gb-oed", "en-gb-oxendict");
        singleEquivMap.put("en-gb-oxendict", "en-gb-oed");
        singleEquivMap.put("esl", "sgn-esl");
        singleEquivMap.put("esn", "sgn-esn");
        singleEquivMap.put("eso", "sgn-eso");
        singleEquivMap.put("eth", "sgn-eth");
        singleEquivMap.put("fcs", "sgn-fcs");
        singleEquivMap.put("fse", "sgn-fse");
        singleEquivMap.put("fss", "sgn-fss");
        singleEquivMap.put("gal", "ilw");
        singleEquivMap.put("gan", "zh-gan");
        singleEquivMap.put("gav", "dev");
        singleEquivMap.put("gdj", "kvs");
        singleEquivMap.put("gds", "sgn-gds");
        singleEquivMap.put("ggn", "gvr");
        singleEquivMap.put("gom", "kok-gom");
        singleEquivMap.put("gse", "sgn-gse");
        singleEquivMap.put("gsm", "sgn-gsm");
        singleEquivMap.put("gti", "nyc");
        singleEquivMap.put("gus", "sgn-gus");
        singleEquivMap.put("guv", "duz");
        singleEquivMap.put("gvr", "ggn");
        singleEquivMap.put("hab", "sgn-hab");
        singleEquivMap.put("haf", "sgn-haf");
        singleEquivMap.put("hds", "sgn-hds");
        singleEquivMap.put("he", "iw");
        singleEquivMap.put("hji", "ms-hji");
        singleEquivMap.put("hks", "sgn-hks");
        singleEquivMap.put("hle", "sca");
        singleEquivMap.put("hos", "sgn-hos");
        singleEquivMap.put("hps", "sgn-hps");
        singleEquivMap.put("hrr", "jal");
        singleEquivMap.put("hsh", "sgn-hsh");
        singleEquivMap.put("hsl", "sgn-hsl");
        singleEquivMap.put("huw", "pmc");
        singleEquivMap.put("i-ami", "ami");
        singleEquivMap.put("i-bnn", "bnn");
        singleEquivMap.put("i-klingon", "tlh");
        singleEquivMap.put("i-lux", "lb");
        singleEquivMap.put("i-navajo", "nv");
        singleEquivMap.put("i-pwn", "pwn");
        singleEquivMap.put("i-tao", "tao");
        singleEquivMap.put("i-tay", "tay");
        singleEquivMap.put("i-tsu", "tsu");
        singleEquivMap.put("iba", "blg");
        singleEquivMap.put("ibi", "opa");
        singleEquivMap.put("icl", "sgn-icl");
        singleEquivMap.put("id", "in");
        singleEquivMap.put("iks", "sgn-iks");
        singleEquivMap.put("ils", "sgn-ils");
        singleEquivMap.put("ilw", "gal");
        singleEquivMap.put("in", "id");
        singleEquivMap.put("inl", "sgn-inl");
        singleEquivMap.put("ins", "sgn-ins");
        singleEquivMap.put("isr", "sgn-isr");
        singleEquivMap.put("iw", "he");
        singleEquivMap.put("jak", "ms-jak");
        singleEquivMap.put("jal", "hrr");
        singleEquivMap.put("jax", "ms-jax");
        singleEquivMap.put("jbo", "art-lojban");
        singleEquivMap.put("jcs", "sgn-jcs");
        singleEquivMap.put("jhs", "sgn-jhs");
        singleEquivMap.put("ji", "yi");
        singleEquivMap.put("jks", "sgn-jks");
        singleEquivMap.put("jls", "sgn-jls");
        singleEquivMap.put("jos", "sgn-jos");
        singleEquivMap.put("jus", "sgn-jus");
        singleEquivMap.put("jv", "jw");
        singleEquivMap.put("jw", "jv");
        singleEquivMap.put("kak", "tne");
        singleEquivMap.put("kdz", "ncp");
        singleEquivMap.put("kgc", "tdf");
        singleEquivMap.put("kgh", "kml");
        singleEquivMap.put("kgi", "sgn-kgi");
        singleEquivMap.put("khk", "drh");
        singleEquivMap.put("kml", "kgh");
        singleEquivMap.put("knn", "kok-knn");
        singleEquivMap.put("koj", "kwv");
        singleEquivMap.put("kok-gom", "gom");
        singleEquivMap.put("kok-knn", "knn");
        singleEquivMap.put("krm", "bmf");
        singleEquivMap.put("kru", "kxl");
        singleEquivMap.put("ktz", "aue");
        singleEquivMap.put("kvb", "ms-kvb");
        singleEquivMap.put("kvk", "sgn-kvk");
        singleEquivMap.put("kvr", "ms-kvr");
        singleEquivMap.put("kvs", "gdj");
        singleEquivMap.put("kwq", "yam");
        singleEquivMap.put("kwv", "koj");
        singleEquivMap.put("kxd", "ms-kxd");
        singleEquivMap.put("kxe", "tvd");
        singleEquivMap.put("kxl", "kru");
        singleEquivMap.put("kxr", "pat");
        singleEquivMap.put("lb", "i-lux");
        singleEquivMap.put("lbs", "sgn-lbs");
        singleEquivMap.put("lce", "ms-lce");
        singleEquivMap.put("lcf", "ms-lcf");
        singleEquivMap.put("lcq", "ppr");
        singleEquivMap.put("lii", "raq");
        singleEquivMap.put("liw", "ms-liw");
        singleEquivMap.put("llo", "ngt");
        singleEquivMap.put("lls", "sgn-lls");
        singleEquivMap.put("lmm", "rmx");
        singleEquivMap.put("lrr", "yma");
        singleEquivMap.put("lsb", "sgn-lsb");
        singleEquivMap.put("lsg", "sgn-lsg");
        singleEquivMap.put("lsl", "sgn-lsl");
        singleEquivMap.put("lsn", "sgn-lsn");
        singleEquivMap.put("lso", "sgn-lso");
        singleEquivMap.put("lsp", "sgn-lsp");
        singleEquivMap.put("lst", "sgn-lst");
        singleEquivMap.put("lsv", "sgn-lsv");
        singleEquivMap.put("lsy", "sgn-lsy");
        singleEquivMap.put("ltg", "lv-ltg");
        singleEquivMap.put("lv-ltg", "ltg");
        singleEquivMap.put("lv-lvs", "lvs");
        singleEquivMap.put("lvs", "lv-lvs");
        singleEquivMap.put("lws", "sgn-lws");
        singleEquivMap.put("lzh", "zh-lzh");
        singleEquivMap.put("max", "ms-max");
        singleEquivMap.put("mdl", "sgn-mdl");
        singleEquivMap.put("meg", "cir");
        singleEquivMap.put("meo", "ms-meo");
        singleEquivMap.put("mfa", "ms-mfa");
        singleEquivMap.put("mfb", "ms-mfb");
        singleEquivMap.put("min", "ms-min");
        singleEquivMap.put("mnp", "zh-mnp");
        singleEquivMap.put("mo", "ro");
        singleEquivMap.put("mom", "cjr");
        singleEquivMap.put("mqg", "ms-mqg");
        singleEquivMap.put("mre", "sgn-mre");
        singleEquivMap.put("ms-bjn", "bjn");
        singleEquivMap.put("ms-btj", "btj");
        singleEquivMap.put("ms-bve", "bve");
        singleEquivMap.put("ms-bvu", "bvu");
        singleEquivMap.put("ms-coa", "coa");
        singleEquivMap.put("ms-dup", "dup");
        singleEquivMap.put("ms-hji", "hji");
        singleEquivMap.put("ms-jak", "jak");
        singleEquivMap.put("ms-jax", "jax");
        singleEquivMap.put("ms-kvb", "kvb");
        singleEquivMap.put("ms-kvr", "kvr");
        singleEquivMap.put("ms-kxd", "kxd");
        singleEquivMap.put("ms-lce", "lce");
        singleEquivMap.put("ms-lcf", "lcf");
        singleEquivMap.put("ms-liw", "liw");
        singleEquivMap.put("ms-max", "max");
        singleEquivMap.put("ms-meo", "meo");
        singleEquivMap.put("ms-mfa", "mfa");
        singleEquivMap.put("ms-mfb", "mfb");
        singleEquivMap.put("ms-min", "min");
        singleEquivMap.put("ms-mqg", "mqg");
        singleEquivMap.put("ms-msi", "msi");
        singleEquivMap.put("ms-mui", "mui");
        singleEquivMap.put("ms-orn", "orn");
        singleEquivMap.put("ms-ors", "ors");
        singleEquivMap.put("ms-pel", "pel");
        singleEquivMap.put("ms-pse", "pse");
        singleEquivMap.put("ms-tmw", "tmw");
        singleEquivMap.put("ms-urk", "urk");
        singleEquivMap.put("ms-vkk", "vkk");
        singleEquivMap.put("ms-vkt", "vkt");
        singleEquivMap.put("ms-xmm", "xmm");
        singleEquivMap.put("ms-zlm", "zlm");
        singleEquivMap.put("ms-zmi", "zmi");
        singleEquivMap.put("ms-zsm", "zsm");
        singleEquivMap.put("msd", "sgn-msd");
        singleEquivMap.put("msi", "ms-msi");
        singleEquivMap.put("msr", "sgn-msr");
        singleEquivMap.put("mtm", "ymt");
        singleEquivMap.put("mui", "ms-mui");
        singleEquivMap.put("myd", "aog");
        singleEquivMap.put("mzc", "sgn-mzc");
        singleEquivMap.put("mzg", "sgn-mzg");
        singleEquivMap.put("mzy", "sgn-mzy");
        singleEquivMap.put("nad", "xny");
        singleEquivMap.put("nb", "no-bok");
        singleEquivMap.put("nbr", "nns");
        singleEquivMap.put("nbs", "sgn-nbs");
        singleEquivMap.put("ncp", "kdz");
        singleEquivMap.put("ngt", "llo");
        singleEquivMap.put("ngv", "nnx");
        singleEquivMap.put("nn", "no-nyn");
        singleEquivMap.put("nns", "nbr");
        singleEquivMap.put("nnx", "ngv");
        singleEquivMap.put("no-bok", "nb");
        singleEquivMap.put("no-nyn", "nn");
        singleEquivMap.put("nsi", "sgn-nsi");
        singleEquivMap.put("nsp", "sgn-nsp");
        singleEquivMap.put("nsr", "sgn-nsr");
        singleEquivMap.put("nun", "ayx");
        singleEquivMap.put("nv", "i-navajo");
        singleEquivMap.put("nxu", "bpp");
        singleEquivMap.put("nyc", "gti");
        singleEquivMap.put("nzs", "sgn-nzs");
        singleEquivMap.put("okl", "sgn-okl");
        singleEquivMap.put("ola", "thw");
        singleEquivMap.put("opa", "ibi");
        singleEquivMap.put("orn", "ms-orn");
        singleEquivMap.put("ors", "ms-ors");
        singleEquivMap.put("pat", "kxr");
        singleEquivMap.put("pcr", "adx");
        singleEquivMap.put("pel", "ms-pel");
        singleEquivMap.put("pga", "ar-pga");
        singleEquivMap.put("pgz", "sgn-pgz");
        singleEquivMap.put("phr", "pmu");
        singleEquivMap.put("pks", "sgn-pks");
        singleEquivMap.put("pmc", "huw");
        singleEquivMap.put("pmu", "phr");
        singleEquivMap.put("ppa", "bfy");
        singleEquivMap.put("ppr", "lcq");
        singleEquivMap.put("prl", "sgn-prl");
        singleEquivMap.put("prt", "pry");
        singleEquivMap.put("pry", "prt");
        singleEquivMap.put("prz", "sgn-prz");
        singleEquivMap.put("psc", "sgn-psc");
        singleEquivMap.put("psd", "sgn-psd");
        singleEquivMap.put("pse", "ms-pse");
        singleEquivMap.put("psg", "sgn-psg");
        singleEquivMap.put("psl", "sgn-psl");
        singleEquivMap.put("pso", "sgn-pso");
        singleEquivMap.put("psp", "sgn-psp");
        singleEquivMap.put("pub", "puz");
        singleEquivMap.put("puz", "pub");
        singleEquivMap.put("pwn", "i-pwn");
        singleEquivMap.put("pys", "sgn-pys");
        singleEquivMap.put("quh", "cqu");
        singleEquivMap.put("raq", "lii");
        singleEquivMap.put("ras", "tie");
        singleEquivMap.put("rms", "sgn-rms");
        singleEquivMap.put("rmx", "lmm");
        singleEquivMap.put("ro", "mo");
        singleEquivMap.put("rsi", "sgn-rsi");
        singleEquivMap.put("rsl", "sgn-rsl");
        singleEquivMap.put("rsm", "sgn-rsm");
        singleEquivMap.put("sca", "hle");
        singleEquivMap.put("scv", "zir");
        singleEquivMap.put("sdl", "sgn-sdl");
        singleEquivMap.put("sgn-ads", "ads");
        singleEquivMap.put("sgn-aed", "aed");
        singleEquivMap.put("sgn-aen", "aen");
        singleEquivMap.put("sgn-afg", "afg");
        singleEquivMap.put("sgn-asf", "asf");
        singleEquivMap.put("sgn-asp", "asp");
        singleEquivMap.put("sgn-asq", "asq");
        singleEquivMap.put("sgn-asw", "asw");
        singleEquivMap.put("sgn-bfk", "bfk");
        singleEquivMap.put("sgn-bog", "bog");
        singleEquivMap.put("sgn-bqn", "bqn");
        singleEquivMap.put("sgn-bqy", "bqy");
        singleEquivMap.put("sgn-bvl", "bvl");
        singleEquivMap.put("sgn-cds", "cds");
        singleEquivMap.put("sgn-csc", "csc");
        singleEquivMap.put("sgn-csd", "csd");
        singleEquivMap.put("sgn-cse", "cse");
        singleEquivMap.put("sgn-csf", "csf");
        singleEquivMap.put("sgn-csg", "csg");
        singleEquivMap.put("sgn-csl", "csl");
        singleEquivMap.put("sgn-csq", "csq");
        singleEquivMap.put("sgn-csr", "csr");
        singleEquivMap.put("sgn-csx", "csx");
        singleEquivMap.put("sgn-doq", "doq");
        singleEquivMap.put("sgn-ecs", "ecs");
        singleEquivMap.put("sgn-ehs", "ehs");
        singleEquivMap.put("sgn-esl", "esl");
        singleEquivMap.put("sgn-esn", "esn");
        singleEquivMap.put("sgn-eso", "eso");
        singleEquivMap.put("sgn-eth", "eth");
        singleEquivMap.put("sgn-fcs", "fcs");
        singleEquivMap.put("sgn-fse", "fse");
        singleEquivMap.put("sgn-fss", "fss");
        singleEquivMap.put("sgn-gds", "gds");
        singleEquivMap.put("sgn-gse", "gse");
        singleEquivMap.put("sgn-gsm", "gsm");
        singleEquivMap.put("sgn-gus", "gus");
        singleEquivMap.put("sgn-hab", "hab");
        singleEquivMap.put("sgn-haf", "haf");
        singleEquivMap.put("sgn-hds", "hds");
        singleEquivMap.put("sgn-hks", "hks");
        singleEquivMap.put("sgn-hos", "hos");
        singleEquivMap.put("sgn-hps", "hps");
        singleEquivMap.put("sgn-hsh", "hsh");
        singleEquivMap.put("sgn-hsl", "hsl");
        singleEquivMap.put("sgn-icl", "icl");
        singleEquivMap.put("sgn-iks", "iks");
        singleEquivMap.put("sgn-ils", "ils");
        singleEquivMap.put("sgn-inl", "inl");
        singleEquivMap.put("sgn-ins", "ins");
        singleEquivMap.put("sgn-isr", "isr");
        singleEquivMap.put("sgn-jcs", "jcs");
        singleEquivMap.put("sgn-jhs", "jhs");
        singleEquivMap.put("sgn-jks", "jks");
        singleEquivMap.put("sgn-jls", "jls");
        singleEquivMap.put("sgn-jos", "jos");
        singleEquivMap.put("sgn-jus", "jus");
        singleEquivMap.put("sgn-kgi", "kgi");
        singleEquivMap.put("sgn-kvk", "kvk");
        singleEquivMap.put("sgn-lbs", "lbs");
        singleEquivMap.put("sgn-lls", "lls");
        singleEquivMap.put("sgn-lsb", "lsb");
        singleEquivMap.put("sgn-lsg", "lsg");
        singleEquivMap.put("sgn-lsl", "lsl");
        singleEquivMap.put("sgn-lsn", "lsn");
        singleEquivMap.put("sgn-lso", "lso");
        singleEquivMap.put("sgn-lsp", "lsp");
        singleEquivMap.put("sgn-lst", "lst");
        singleEquivMap.put("sgn-lsv", "lsv");
        singleEquivMap.put("sgn-lsy", "lsy");
        singleEquivMap.put("sgn-lws", "lws");
        singleEquivMap.put("sgn-mdl", "mdl");
        singleEquivMap.put("sgn-mre", "mre");
        singleEquivMap.put("sgn-msd", "msd");
        singleEquivMap.put("sgn-msr", "msr");
        singleEquivMap.put("sgn-mzc", "mzc");
        singleEquivMap.put("sgn-mzg", "mzg");
        singleEquivMap.put("sgn-mzy", "mzy");
        singleEquivMap.put("sgn-nbs", "nbs");
        singleEquivMap.put("sgn-nsi", "nsi");
        singleEquivMap.put("sgn-nsp", "nsp");
        singleEquivMap.put("sgn-nsr", "nsr");
        singleEquivMap.put("sgn-nzs", "nzs");
        singleEquivMap.put("sgn-okl", "okl");
        singleEquivMap.put("sgn-pgz", "pgz");
        singleEquivMap.put("sgn-pks", "pks");
        singleEquivMap.put("sgn-prl", "prl");
        singleEquivMap.put("sgn-prz", "prz");
        singleEquivMap.put("sgn-psc", "psc");
        singleEquivMap.put("sgn-psd", "psd");
        singleEquivMap.put("sgn-psg", "psg");
        singleEquivMap.put("sgn-psl", "psl");
        singleEquivMap.put("sgn-pso", "pso");
        singleEquivMap.put("sgn-psp", "psp");
        singleEquivMap.put("sgn-pys", "pys");
        singleEquivMap.put("sgn-rms", "rms");
        singleEquivMap.put("sgn-rsi", "rsi");
        singleEquivMap.put("sgn-rsl", "rsl");
        singleEquivMap.put("sgn-rsm", "rsm");
        singleEquivMap.put("sgn-sdl", "sdl");
        singleEquivMap.put("sgn-sgx", "sgx");
        singleEquivMap.put("sgn-slf", "slf");
        singleEquivMap.put("sgn-sls", "sls");
        singleEquivMap.put("sgn-sqk", "sqk");
        singleEquivMap.put("sgn-sqs", "sqs");
        singleEquivMap.put("sgn-sqx", "sqx");
        singleEquivMap.put("sgn-ssr", "ssr");
        singleEquivMap.put("sgn-svk", "svk");
        singleEquivMap.put("sgn-syy", "syy");
        singleEquivMap.put("sgn-szs", "szs");
        singleEquivMap.put("sgn-tse", "tse");
        singleEquivMap.put("sgn-tsm", "tsm");
        singleEquivMap.put("sgn-tsq", "tsq");
        singleEquivMap.put("sgn-tss", "tss");
        singleEquivMap.put("sgn-tsy", "tsy");
        singleEquivMap.put("sgn-tza", "tza");
        singleEquivMap.put("sgn-ugn", "ugn");
        singleEquivMap.put("sgn-ugy", "ugy");
        singleEquivMap.put("sgn-ukl", "ukl");
        singleEquivMap.put("sgn-uks", "uks");
        singleEquivMap.put("sgn-vsi", "vsi");
        singleEquivMap.put("sgn-vsl", "vsl");
        singleEquivMap.put("sgn-vsv", "vsv");
        singleEquivMap.put("sgn-wbs", "wbs");
        singleEquivMap.put("sgn-xki", "xki");
        singleEquivMap.put("sgn-xml", "xml");
        singleEquivMap.put("sgn-xms", "xms");
        singleEquivMap.put("sgn-yds", "yds");
        singleEquivMap.put("sgn-ygs", "ygs");
        singleEquivMap.put("sgn-yhs", "yhs");
        singleEquivMap.put("sgn-ysl", "ysl");
        singleEquivMap.put("sgn-ysm", "ysm");
        singleEquivMap.put("sgn-zib", "zib");
        singleEquivMap.put("sgn-zsl", "zsl");
        singleEquivMap.put("sgx", "sgn-sgx");
        singleEquivMap.put("shu", "ar-shu");
        singleEquivMap.put("slf", "sgn-slf");
        singleEquivMap.put("sls", "sgn-sls");
        singleEquivMap.put("snz", "asd");
        singleEquivMap.put("sqk", "sgn-sqk");
        singleEquivMap.put("sqs", "sgn-sqs");
        singleEquivMap.put("sqx", "sgn-sqx");
        singleEquivMap.put("ssh", "ar-ssh");
        singleEquivMap.put("ssr", "sgn-ssr");
        singleEquivMap.put("svk", "sgn-svk");
        singleEquivMap.put("sw-swc", "swc");
        singleEquivMap.put("sw-swh", "swh");
        singleEquivMap.put("swc", "sw-swc");
        singleEquivMap.put("swh", "sw-swh");
        singleEquivMap.put("syy", "sgn-syy");
        singleEquivMap.put("szs", "sgn-szs");
        singleEquivMap.put("taj", "tsf");
        singleEquivMap.put("tao", "i-tao");
        singleEquivMap.put("tay", "i-tay");
        singleEquivMap.put("tdf", "kgc");
        singleEquivMap.put("thc", "tpo");
        singleEquivMap.put("thw", "ola");
        singleEquivMap.put("tie", "ras");
        singleEquivMap.put("tkk", "twm");
        singleEquivMap.put("tlh", "i-klingon");
        singleEquivMap.put("tlw", "weo");
        singleEquivMap.put("tmp", "tyj");
        singleEquivMap.put("tmw", "ms-tmw");
        singleEquivMap.put("tne", "kak");
        singleEquivMap.put("tpo", "thc");
        singleEquivMap.put("tse", "sgn-tse");
        singleEquivMap.put("tsf", "taj");
        singleEquivMap.put("tsm", "sgn-tsm");
        singleEquivMap.put("tsq", "sgn-tsq");
        singleEquivMap.put("tss", "sgn-tss");
        singleEquivMap.put("tsu", "i-tsu");
        singleEquivMap.put("tsy", "sgn-tsy");
        singleEquivMap.put("tvd", "kxe");
        singleEquivMap.put("twm", "tkk");
        singleEquivMap.put("tyj", "tmp");
        singleEquivMap.put("tza", "sgn-tza");
        singleEquivMap.put("ugn", "sgn-ugn");
        singleEquivMap.put("ugy", "sgn-ugy");
        singleEquivMap.put("ukl", "sgn-ukl");
        singleEquivMap.put("uks", "sgn-uks");
        singleEquivMap.put("uok", "ema");
        singleEquivMap.put("urk", "ms-urk");
        singleEquivMap.put("uz-uzn", "uzn");
        singleEquivMap.put("uz-uzs", "uzs");
        singleEquivMap.put("uzn", "uz-uzn");
        singleEquivMap.put("uzs", "uz-uzs");
        singleEquivMap.put("vkk", "ms-vkk");
        singleEquivMap.put("vkt", "ms-vkt");
        singleEquivMap.put("vsi", "sgn-vsi");
        singleEquivMap.put("vsl", "sgn-vsl");
        singleEquivMap.put("vsv", "sgn-vsv");
        singleEquivMap.put("waw", "xkh");
        singleEquivMap.put("wbs", "sgn-wbs");
        singleEquivMap.put("weo", "tlw");
        singleEquivMap.put("wuu", "zh-wuu");
        singleEquivMap.put("xba", "cax");
        singleEquivMap.put("xch", "cmk");
        singleEquivMap.put("xia", "acn");
        singleEquivMap.put("xkh", "waw");
        singleEquivMap.put("xki", "sgn-xki");
        singleEquivMap.put("xml", "sgn-xml");
        singleEquivMap.put("xmm", "ms-xmm");
        singleEquivMap.put("xms", "sgn-xms");
        singleEquivMap.put("xny", "nad");
        singleEquivMap.put("xrq", "dmw");
        singleEquivMap.put("yam", "kwq");
        singleEquivMap.put("yds", "sgn-yds");
        singleEquivMap.put("ygs", "sgn-ygs");
        singleEquivMap.put("yhs", "sgn-yhs");
        singleEquivMap.put("yi", "ji");
        singleEquivMap.put("yma", "lrr");
        singleEquivMap.put("ymt", "mtm");
        singleEquivMap.put("yos", "zom");
        singleEquivMap.put("ysl", "sgn-ysl");
        singleEquivMap.put("ysm", "sgn-ysm");
        singleEquivMap.put("yue", "zh-yue");
        singleEquivMap.put("yug", "yuu");
        singleEquivMap.put("yuu", "yug");
        singleEquivMap.put("zh-cdo", "cdo");
        singleEquivMap.put("zh-cjy", "cjy");
        singleEquivMap.put("zh-cmn-hans", "cmn-hans");
        singleEquivMap.put("zh-cmn-hant", "cmn-hant");
        singleEquivMap.put("zh-cnp", "cnp");
        singleEquivMap.put("zh-cpx", "cpx");
        singleEquivMap.put("zh-csp", "csp");
        singleEquivMap.put("zh-czh", "czh");
        singleEquivMap.put("zh-czo", "czo");
        singleEquivMap.put("zh-gan", "gan");
        singleEquivMap.put("zh-lzh", "lzh");
        singleEquivMap.put("zh-mnp", "mnp");
        singleEquivMap.put("zh-wuu", "wuu");
        singleEquivMap.put("zh-yue", "yue");
        singleEquivMap.put("zib", "sgn-zib");
        singleEquivMap.put("zir", "scv");
        singleEquivMap.put("zlm", "ms-zlm");
        singleEquivMap.put("zmi", "ms-zmi");
        singleEquivMap.put("zom", "yos");
        singleEquivMap.put("zsl", "sgn-zsl");
        singleEquivMap.put("zsm", "ms-zsm");

        multiEquivsMap.put("ase", new String[] {"sgn-ase", "sgn-us"});
        multiEquivsMap.put("bfi", new String[] {"sgn-bfi", "sgn-gb"});
        multiEquivsMap.put("bzs", new String[] {"sgn-bzs", "sgn-br"});
        multiEquivsMap.put("ccq", new String[] {"rki", "ybd"});
        multiEquivsMap.put("cmn", new String[] {"zh-cmn", "zh-guoyu"});
        multiEquivsMap.put("coy", new String[] {"pij", "nts"});
        multiEquivsMap.put("csn", new String[] {"sgn-csn", "sgn-co"});
        multiEquivsMap.put("drr", new String[] {"kzk", "gli"});
        multiEquivsMap.put("drw", new String[] {"prs", "tnf"});
        multiEquivsMap.put("dse", new String[] {"sgn-dse", "sgn-nl"});
        multiEquivsMap.put("dsl", new String[] {"sgn-dsl", "sgn-dk"});
        multiEquivsMap.put("dtp", new String[] {"ktr", "kzj", "kzt", "tdu"});
        multiEquivsMap.put("fsl", new String[] {"sgn-fsl", "sgn-fr"});
        multiEquivsMap.put("gfx", new String[] {"vaj", "mwj", "oun"});
        multiEquivsMap.put("gli", new String[] {"kzk", "drr"});
        multiEquivsMap.put("gsg", new String[] {"sgn-gsg", "sgn-de"});
        multiEquivsMap.put("gss", new String[] {"sgn-gss", "sgn-gr"});
        multiEquivsMap.put("hak", new String[] {"zh-hak", "i-hak", "zh-hakka"});
        multiEquivsMap.put("hsn", new String[] {"zh-hsn", "zh-xiang"});
        multiEquivsMap.put("i-hak", new String[] {"hak", "zh-hak", "zh-hakka"});
        multiEquivsMap.put("ise", new String[] {"sgn-ise", "sgn-it"});
        multiEquivsMap.put("isg", new String[] {"sgn-isg", "sgn-ie"});
        multiEquivsMap.put("jeg", new String[] {"oyb", "skk", "thx"});
        multiEquivsMap.put("jsl", new String[] {"sgn-jsl", "sgn-jp"});
        multiEquivsMap.put("ktr", new String[] {"dtp", "kzj", "kzt", "tdu"});
        multiEquivsMap.put("kzj", new String[] {"dtp", "ktr", "kzt", "tdu"});
        multiEquivsMap.put("kzk", new String[] {"drr", "gli"});
        multiEquivsMap.put("kzt", new String[] {"dtp", "ktr", "kzj", "tdu"});
        multiEquivsMap.put("mfs", new String[] {"sgn-mfs", "sgn-mx"});
        multiEquivsMap.put("mry", new String[] {"mst", "myt"});
        multiEquivsMap.put("mst", new String[] {"mry", "myt"});
        multiEquivsMap.put("mwj", new String[] {"vaj", "gfx", "oun"});
        multiEquivsMap.put("myt", new String[] {"mry", "mst"});
        multiEquivsMap.put("nan", new String[] {"zh-nan", "zh-min-nan"});
        multiEquivsMap.put("ncs", new String[] {"sgn-ncs", "sgn-ni"});
        multiEquivsMap.put("nsl", new String[] {"sgn-nsl", "sgn-no"});
        multiEquivsMap.put("nts", new String[] {"pij", "coy"});
        multiEquivsMap.put("oun", new String[] {"vaj", "gfx", "mwj"});
        multiEquivsMap.put("oyb", new String[] {"jeg", "skk", "thx"});
        multiEquivsMap.put("pij", new String[] {"coy", "nts"});
        multiEquivsMap.put("prs", new String[] {"drw", "tnf"});
        multiEquivsMap.put("psr", new String[] {"sgn-psr", "sgn-pt"});
        multiEquivsMap.put("rki", new String[] {"ccq", "ybd"});
        multiEquivsMap.put("sfb", new String[] {"sgn-sfb", "sgn-be-fr"});
        multiEquivsMap.put("sfs", new String[] {"sgn-sfs", "sgn-za"});
        multiEquivsMap.put("sgg", new String[] {"sgn-sgg", "sgn-ch-de"});
        multiEquivsMap.put("sgn-ase", new String[] {"ase", "sgn-us"});
        multiEquivsMap.put("sgn-be-fr", new String[] {"sfb", "sgn-sfb"});
        multiEquivsMap.put("sgn-be-nl", new String[] {"vgt", "sgn-vgt"});
        multiEquivsMap.put("sgn-bfi", new String[] {"bfi", "sgn-gb"});
        multiEquivsMap.put("sgn-br", new String[] {"bzs", "sgn-bzs"});
        multiEquivsMap.put("sgn-bzs", new String[] {"bzs", "sgn-br"});
        multiEquivsMap.put("sgn-ch-de", new String[] {"sgg", "sgn-sgg"});
        multiEquivsMap.put("sgn-co", new String[] {"csn", "sgn-csn"});
        multiEquivsMap.put("sgn-csn", new String[] {"csn", "sgn-co"});
        multiEquivsMap.put("sgn-de", new String[] {"gsg", "sgn-gsg"});
        multiEquivsMap.put("sgn-dk", new String[] {"dsl", "sgn-dsl"});
        multiEquivsMap.put("sgn-dse", new String[] {"dse", "sgn-nl"});
        multiEquivsMap.put("sgn-dsl", new String[] {"dsl", "sgn-dk"});
        multiEquivsMap.put("sgn-es", new String[] {"ssp", "sgn-ssp"});
        multiEquivsMap.put("sgn-fr", new String[] {"fsl", "sgn-fsl"});
        multiEquivsMap.put("sgn-fsl", new String[] {"fsl", "sgn-fr"});
        multiEquivsMap.put("sgn-gb", new String[] {"bfi", "sgn-bfi"});
        multiEquivsMap.put("sgn-gr", new String[] {"gss", "sgn-gss"});
        multiEquivsMap.put("sgn-gsg", new String[] {"gsg", "sgn-de"});
        multiEquivsMap.put("sgn-gss", new String[] {"gss", "sgn-gr"});
        multiEquivsMap.put("sgn-ie", new String[] {"isg", "sgn-isg"});
        multiEquivsMap.put("sgn-ise", new String[] {"ise", "sgn-it"});
        multiEquivsMap.put("sgn-isg", new String[] {"isg", "sgn-ie"});
        multiEquivsMap.put("sgn-it", new String[] {"ise", "sgn-ise"});
        multiEquivsMap.put("sgn-jp", new String[] {"jsl", "sgn-jsl"});
        multiEquivsMap.put("sgn-jsl", new String[] {"jsl", "sgn-jp"});
        multiEquivsMap.put("sgn-mfs", new String[] {"mfs", "sgn-mx"});
        multiEquivsMap.put("sgn-mx", new String[] {"mfs", "sgn-mfs"});
        multiEquivsMap.put("sgn-ncs", new String[] {"ncs", "sgn-ni"});
        multiEquivsMap.put("sgn-ni", new String[] {"ncs", "sgn-ncs"});
        multiEquivsMap.put("sgn-nl", new String[] {"dse", "sgn-dse"});
        multiEquivsMap.put("sgn-no", new String[] {"nsl", "sgn-nsl"});
        multiEquivsMap.put("sgn-nsl", new String[] {"nsl", "sgn-no"});
        multiEquivsMap.put("sgn-psr", new String[] {"psr", "sgn-pt"});
        multiEquivsMap.put("sgn-pt", new String[] {"psr", "sgn-psr"});
        multiEquivsMap.put("sgn-se", new String[] {"swl", "sgn-swl"});
        multiEquivsMap.put("sgn-sfb", new String[] {"sfb", "sgn-be-fr"});
        multiEquivsMap.put("sgn-sfs", new String[] {"sfs", "sgn-za"});
        multiEquivsMap.put("sgn-sgg", new String[] {"sgg", "sgn-ch-de"});
        multiEquivsMap.put("sgn-ssp", new String[] {"ssp", "sgn-es"});
        multiEquivsMap.put("sgn-swl", new String[] {"swl", "sgn-se"});
        multiEquivsMap.put("sgn-us", new String[] {"ase", "sgn-ase"});
        multiEquivsMap.put("sgn-vgt", new String[] {"vgt", "sgn-be-nl"});
        multiEquivsMap.put("sgn-za", new String[] {"sfs", "sgn-sfs"});
        multiEquivsMap.put("skk", new String[] {"oyb", "jeg", "thx"});
        multiEquivsMap.put("ssp", new String[] {"sgn-ssp", "sgn-es"});
        multiEquivsMap.put("swl", new String[] {"sgn-swl", "sgn-se"});
        multiEquivsMap.put("tdu", new String[] {"dtp", "ktr", "kzj", "kzt"});
        multiEquivsMap.put("thx", new String[] {"oyb", "jeg", "skk"});
        multiEquivsMap.put("tnf", new String[] {"prs", "drw"});
        multiEquivsMap.put("vaj", new String[] {"gfx", "mwj", "oun"});
        multiEquivsMap.put("vgt", new String[] {"sgn-vgt", "sgn-be-nl"});
        multiEquivsMap.put("ybd", new String[] {"rki", "ccq"});
        multiEquivsMap.put("zh-cmn", new String[] {"cmn", "zh-guoyu"});
        multiEquivsMap.put("zh-guoyu", new String[] {"cmn", "zh-cmn"});
        multiEquivsMap.put("zh-hak", new String[] {"hak", "i-hak", "zh-hakka"});
        multiEquivsMap.put("zh-hakka", new String[] {"hak", "zh-hak", "i-hak"});
        multiEquivsMap.put("zh-hsn", new String[] {"hsn", "zh-xiang"});
        multiEquivsMap.put("zh-min-nan", new String[] {"nan", "zh-nan"});
        multiEquivsMap.put("zh-nan", new String[] {"nan", "zh-min-nan"});
        multiEquivsMap.put("zh-xiang", new String[] {"hsn", "zh-hsn"});

        regionVariantEquivMap.put("-alalc97", "-heploc");
        regionVariantEquivMap.put("-bu", "-mm");
        regionVariantEquivMap.put("-cd", "-zr");
        regionVariantEquivMap.put("-dd", "-de");
        regionVariantEquivMap.put("-de", "-dd");
        regionVariantEquivMap.put("-fr", "-fx");
        regionVariantEquivMap.put("-fx", "-fr");
        regionVariantEquivMap.put("-heploc", "-alalc97");
        regionVariantEquivMap.put("-mm", "-bu");
        regionVariantEquivMap.put("-tl", "-tp");
        regionVariantEquivMap.put("-tp", "-tl");
        regionVariantEquivMap.put("-yd", "-ye");
        regionVariantEquivMap.put("-ye", "-yd");
        regionVariantEquivMap.put("-zr", "-cd");
    }

}