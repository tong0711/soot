/* This file was generated by SableCC (http://www.sablecc.org/). */

package soot.jimple.parser.parser;

import soot.jimple.parser.node.*;
import soot.jimple.parser.analysis.*;

class TokenIndex extends AnalysisAdapter
{
    int index;

    @Override
    public void caseTAbstract(@SuppressWarnings("unused") TAbstract node)
    {
        this.index = 0;
    }

    @Override
    public void caseTFinal(@SuppressWarnings("unused") TFinal node)
    {
        this.index = 1;
    }

    @Override
    public void caseTNative(@SuppressWarnings("unused") TNative node)
    {
        this.index = 2;
    }

    @Override
    public void caseTPublic(@SuppressWarnings("unused") TPublic node)
    {
        this.index = 3;
    }

    @Override
    public void caseTProtected(@SuppressWarnings("unused") TProtected node)
    {
        this.index = 4;
    }

    @Override
    public void caseTPrivate(@SuppressWarnings("unused") TPrivate node)
    {
        this.index = 5;
    }

    @Override
    public void caseTStatic(@SuppressWarnings("unused") TStatic node)
    {
        this.index = 6;
    }

    @Override
    public void caseTSynchronized(@SuppressWarnings("unused") TSynchronized node)
    {
        this.index = 7;
    }

    @Override
    public void caseTTransient(@SuppressWarnings("unused") TTransient node)
    {
        this.index = 8;
    }

    @Override
    public void caseTVolatile(@SuppressWarnings("unused") TVolatile node)
    {
        this.index = 9;
    }

    @Override
    public void caseTStrictfp(@SuppressWarnings("unused") TStrictfp node)
    {
        this.index = 10;
    }

    @Override
    public void caseTEnum(@SuppressWarnings("unused") TEnum node)
    {
        this.index = 11;
    }

    @Override
    public void caseTAnnotation(@SuppressWarnings("unused") TAnnotation node)
    {
        this.index = 12;
    }

    @Override
    public void caseTClass(@SuppressWarnings("unused") TClass node)
    {
        this.index = 13;
    }

    @Override
    public void caseTInterface(@SuppressWarnings("unused") TInterface node)
    {
        this.index = 14;
    }

    @Override
    public void caseTVoid(@SuppressWarnings("unused") TVoid node)
    {
        this.index = 15;
    }

    @Override
    public void caseTBoolean(@SuppressWarnings("unused") TBoolean node)
    {
        this.index = 16;
    }

    @Override
    public void caseTByte(@SuppressWarnings("unused") TByte node)
    {
        this.index = 17;
    }

    @Override
    public void caseTShort(@SuppressWarnings("unused") TShort node)
    {
        this.index = 18;
    }

    @Override
    public void caseTChar(@SuppressWarnings("unused") TChar node)
    {
        this.index = 19;
    }

    @Override
    public void caseTInt(@SuppressWarnings("unused") TInt node)
    {
        this.index = 20;
    }

    @Override
    public void caseTLong(@SuppressWarnings("unused") TLong node)
    {
        this.index = 21;
    }

    @Override
    public void caseTFloat(@SuppressWarnings("unused") TFloat node)
    {
        this.index = 22;
    }

    @Override
    public void caseTDouble(@SuppressWarnings("unused") TDouble node)
    {
        this.index = 23;
    }

    @Override
    public void caseTNullType(@SuppressWarnings("unused") TNullType node)
    {
        this.index = 24;
    }

    @Override
    public void caseTUnknown(@SuppressWarnings("unused") TUnknown node)
    {
        this.index = 25;
    }

    @Override
    public void caseTExtends(@SuppressWarnings("unused") TExtends node)
    {
        this.index = 26;
    }

    @Override
    public void caseTImplements(@SuppressWarnings("unused") TImplements node)
    {
        this.index = 27;
    }

    @Override
    public void caseTBreakpoint(@SuppressWarnings("unused") TBreakpoint node)
    {
        this.index = 28;
    }

    @Override
    public void caseTCase(@SuppressWarnings("unused") TCase node)
    {
        this.index = 29;
    }

    @Override
    public void caseTCatch(@SuppressWarnings("unused") TCatch node)
    {
        this.index = 30;
    }

    @Override
    public void caseTCmp(@SuppressWarnings("unused") TCmp node)
    {
        this.index = 31;
    }

    @Override
    public void caseTCmpg(@SuppressWarnings("unused") TCmpg node)
    {
        this.index = 32;
    }

    @Override
    public void caseTCmpl(@SuppressWarnings("unused") TCmpl node)
    {
        this.index = 33;
    }

    @Override
    public void caseTDefault(@SuppressWarnings("unused") TDefault node)
    {
        this.index = 34;
    }

    @Override
    public void caseTEntermonitor(@SuppressWarnings("unused") TEntermonitor node)
    {
        this.index = 35;
    }

    @Override
    public void caseTExitmonitor(@SuppressWarnings("unused") TExitmonitor node)
    {
        this.index = 36;
    }

    @Override
    public void caseTGoto(@SuppressWarnings("unused") TGoto node)
    {
        this.index = 37;
    }

    @Override
    public void caseTIf(@SuppressWarnings("unused") TIf node)
    {
        this.index = 38;
    }

    @Override
    public void caseTInstanceof(@SuppressWarnings("unused") TInstanceof node)
    {
        this.index = 39;
    }

    @Override
    public void caseTInterfaceinvoke(@SuppressWarnings("unused") TInterfaceinvoke node)
    {
        this.index = 40;
    }

    @Override
    public void caseTLengthof(@SuppressWarnings("unused") TLengthof node)
    {
        this.index = 41;
    }

    @Override
    public void caseTLookupswitch(@SuppressWarnings("unused") TLookupswitch node)
    {
        this.index = 42;
    }

    @Override
    public void caseTNeg(@SuppressWarnings("unused") TNeg node)
    {
        this.index = 43;
    }

    @Override
    public void caseTNew(@SuppressWarnings("unused") TNew node)
    {
        this.index = 44;
    }

    @Override
    public void caseTNewarray(@SuppressWarnings("unused") TNewarray node)
    {
        this.index = 45;
    }

    @Override
    public void caseTNewmultiarray(@SuppressWarnings("unused") TNewmultiarray node)
    {
        this.index = 46;
    }

    @Override
    public void caseTNop(@SuppressWarnings("unused") TNop node)
    {
        this.index = 47;
    }

    @Override
    public void caseTRet(@SuppressWarnings("unused") TRet node)
    {
        this.index = 48;
    }

    @Override
    public void caseTReturn(@SuppressWarnings("unused") TReturn node)
    {
        this.index = 49;
    }

    @Override
    public void caseTSpecialinvoke(@SuppressWarnings("unused") TSpecialinvoke node)
    {
        this.index = 50;
    }

    @Override
    public void caseTStaticinvoke(@SuppressWarnings("unused") TStaticinvoke node)
    {
        this.index = 51;
    }

    @Override
    public void caseTDynamicinvoke(@SuppressWarnings("unused") TDynamicinvoke node)
    {
        this.index = 52;
    }

    @Override
    public void caseTTableswitch(@SuppressWarnings("unused") TTableswitch node)
    {
        this.index = 53;
    }

    @Override
    public void caseTThrow(@SuppressWarnings("unused") TThrow node)
    {
        this.index = 54;
    }

    @Override
    public void caseTThrows(@SuppressWarnings("unused") TThrows node)
    {
        this.index = 55;
    }

    @Override
    public void caseTVirtualinvoke(@SuppressWarnings("unused") TVirtualinvoke node)
    {
        this.index = 56;
    }

    @Override
    public void caseTNull(@SuppressWarnings("unused") TNull node)
    {
        this.index = 57;
    }

    @Override
    public void caseTFrom(@SuppressWarnings("unused") TFrom node)
    {
        this.index = 58;
    }

    @Override
    public void caseTTo(@SuppressWarnings("unused") TTo node)
    {
        this.index = 59;
    }

    @Override
    public void caseTWith(@SuppressWarnings("unused") TWith node)
    {
        this.index = 60;
    }

    @Override
    public void caseTCls(@SuppressWarnings("unused") TCls node)
    {
        this.index = 61;
    }

    @Override
    public void caseTComma(@SuppressWarnings("unused") TComma node)
    {
        this.index = 62;
    }

    @Override
    public void caseTLBrace(@SuppressWarnings("unused") TLBrace node)
    {
        this.index = 63;
    }

    @Override
    public void caseTRBrace(@SuppressWarnings("unused") TRBrace node)
    {
        this.index = 64;
    }

    @Override
    public void caseTSemicolon(@SuppressWarnings("unused") TSemicolon node)
    {
        this.index = 65;
    }

    @Override
    public void caseTLBracket(@SuppressWarnings("unused") TLBracket node)
    {
        this.index = 66;
    }

    @Override
    public void caseTRBracket(@SuppressWarnings("unused") TRBracket node)
    {
        this.index = 67;
    }

    @Override
    public void caseTLParen(@SuppressWarnings("unused") TLParen node)
    {
        this.index = 68;
    }

    @Override
    public void caseTRParen(@SuppressWarnings("unused") TRParen node)
    {
        this.index = 69;
    }

    @Override
    public void caseTColon(@SuppressWarnings("unused") TColon node)
    {
        this.index = 70;
    }

    @Override
    public void caseTDot(@SuppressWarnings("unused") TDot node)
    {
        this.index = 71;
    }

    @Override
    public void caseTQuote(@SuppressWarnings("unused") TQuote node)
    {
        this.index = 72;
    }

    @Override
    public void caseTColonEquals(@SuppressWarnings("unused") TColonEquals node)
    {
        this.index = 73;
    }

    @Override
    public void caseTEquals(@SuppressWarnings("unused") TEquals node)
    {
        this.index = 74;
    }

    @Override
    public void caseTAnd(@SuppressWarnings("unused") TAnd node)
    {
        this.index = 75;
    }

    @Override
    public void caseTOr(@SuppressWarnings("unused") TOr node)
    {
        this.index = 76;
    }

    @Override
    public void caseTXor(@SuppressWarnings("unused") TXor node)
    {
        this.index = 77;
    }

    @Override
    public void caseTMod(@SuppressWarnings("unused") TMod node)
    {
        this.index = 78;
    }

    @Override
    public void caseTCmpeq(@SuppressWarnings("unused") TCmpeq node)
    {
        this.index = 79;
    }

    @Override
    public void caseTCmpne(@SuppressWarnings("unused") TCmpne node)
    {
        this.index = 80;
    }

    @Override
    public void caseTCmpgt(@SuppressWarnings("unused") TCmpgt node)
    {
        this.index = 81;
    }

    @Override
    public void caseTCmpge(@SuppressWarnings("unused") TCmpge node)
    {
        this.index = 82;
    }

    @Override
    public void caseTCmplt(@SuppressWarnings("unused") TCmplt node)
    {
        this.index = 83;
    }

    @Override
    public void caseTCmple(@SuppressWarnings("unused") TCmple node)
    {
        this.index = 84;
    }

    @Override
    public void caseTShl(@SuppressWarnings("unused") TShl node)
    {
        this.index = 85;
    }

    @Override
    public void caseTShr(@SuppressWarnings("unused") TShr node)
    {
        this.index = 86;
    }

    @Override
    public void caseTUshr(@SuppressWarnings("unused") TUshr node)
    {
        this.index = 87;
    }

    @Override
    public void caseTPlus(@SuppressWarnings("unused") TPlus node)
    {
        this.index = 88;
    }

    @Override
    public void caseTMinus(@SuppressWarnings("unused") TMinus node)
    {
        this.index = 89;
    }

    @Override
    public void caseTMult(@SuppressWarnings("unused") TMult node)
    {
        this.index = 90;
    }

    @Override
    public void caseTDiv(@SuppressWarnings("unused") TDiv node)
    {
        this.index = 91;
    }

    @Override
    public void caseTQuotedName(@SuppressWarnings("unused") TQuotedName node)
    {
        this.index = 92;
    }

    @Override
    public void caseTFullIdentifier(@SuppressWarnings("unused") TFullIdentifier node)
    {
        this.index = 93;
    }

    @Override
    public void caseTIdentifier(@SuppressWarnings("unused") TIdentifier node)
    {
        this.index = 94;
    }

    @Override
    public void caseTAtIdentifier(@SuppressWarnings("unused") TAtIdentifier node)
    {
        this.index = 95;
    }

    @Override
    public void caseTBoolConstant(@SuppressWarnings("unused") TBoolConstant node)
    {
        this.index = 96;
    }

    @Override
    public void caseTIntegerConstant(@SuppressWarnings("unused") TIntegerConstant node)
    {
        this.index = 97;
    }

    @Override
    public void caseTFloatConstant(@SuppressWarnings("unused") TFloatConstant node)
    {
        this.index = 98;
    }

    @Override
    public void caseTStringConstant(@SuppressWarnings("unused") TStringConstant node)
    {
        this.index = 99;
    }

    @Override
    public void caseEOF(@SuppressWarnings("unused") EOF node)
    {
        this.index = 100;
    }
}
