// Generated from java-escape by ANTLR 4.11.1
package io.github.rosemoe.sora.langs.javascript;

import org.antlr.v4.runtime.FailedPredicateException;
import org.antlr.v4.runtime.NoViableAltException;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.RuleContext;
import org.antlr.v4.runtime.RuntimeMetaData;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.Vocabulary;
import org.antlr.v4.runtime.VocabularyImpl;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class JavaScriptParser extends JavaScriptParserBase {
  static {
    RuntimeMetaData.checkVersion("4.11.1", RuntimeMetaData.VERSION);
  }

  protected static final DFA[] _decisionToDFA;
  protected static final PredictionContextCache _sharedContextCache = new PredictionContextCache();
  public static final int MultiLineCommentOpen = 1,
      MultiLineComment = 2,
      SingleLineComment = 3,
      RegularExpressionLiteral = 4,
      OpenBracket = 5,
      CloseBracket = 6,
      OpenParen = 7,
      CloseParen = 8,
      OpenBrace = 9,
      TemplateCloseBrace = 10,
      CloseBrace = 11,
      SemiColon = 12,
      Comma = 13,
      Assign = 14,
      QuestionMark = 15,
      QuestionMarkDot = 16,
      Colon = 17,
      Ellipsis = 18,
      Dot = 19,
      PlusPlus = 20,
      MinusMinus = 21,
      Plus = 22,
      Minus = 23,
      BitNot = 24,
      Not = 25,
      Multiply = 26,
      Divide = 27,
      Modulus = 28,
      Power = 29,
      NullCoalesce = 30,
      Hashtag = 31,
      RightShiftArithmetic = 32,
      LeftShiftArithmetic = 33,
      RightShiftLogical = 34,
      LessThan = 35,
      MoreThan = 36,
      LessThanEquals = 37,
      GreaterThanEquals = 38,
      Equals_ = 39,
      NotEquals = 40,
      IdentityEquals = 41,
      IdentityNotEquals = 42,
      BitAnd = 43,
      BitXOr = 44,
      BitOr = 45,
      And = 46,
      Or = 47,
      MultiplyAssign = 48,
      DivideAssign = 49,
      ModulusAssign = 50,
      PlusAssign = 51,
      MinusAssign = 52,
      LeftShiftArithmeticAssign = 53,
      RightShiftArithmeticAssign = 54,
      RightShiftLogicalAssign = 55,
      BitAndAssign = 56,
      BitXorAssign = 57,
      BitOrAssign = 58,
      PowerAssign = 59,
      ARROW = 60,
      NullLiteral = 61,
      BooleanLiteral = 62,
      DecimalLiteral = 63,
      HexIntegerLiteral = 64,
      OctalIntegerLiteral = 65,
      OctalIntegerLiteral2 = 66,
      BinaryIntegerLiteral = 67,
      BigHexIntegerLiteral = 68,
      BigOctalIntegerLiteral = 69,
      BigBinaryIntegerLiteral = 70,
      BigDecimalIntegerLiteral = 71,
      Break = 72,
      Do = 73,
      Instanceof = 74,
      Typeof = 75,
      Case = 76,
      Else = 77,
      New = 78,
      Var = 79,
      Catch = 80,
      Finally = 81,
      Return = 82,
      Void = 83,
      Continue = 84,
      For = 85,
      Switch = 86,
      While = 87,
      Debugger = 88,
      Function_ = 89,
      This = 90,
      With = 91,
      Default = 92,
      If = 93,
      Throw = 94,
      Delete = 95,
      In = 96,
      Try = 97,
      As = 98,
      From = 99,
      Class = 100,
      Enum = 101,
      Extends = 102,
      Super = 103,
      Const = 104,
      Export = 105,
      Import = 106,
      Async = 107,
      Await = 108,
      Yield = 109,
      Implements = 110,
      StrictLet = 111,
      NonStrictLet = 112,
      Private = 113,
      Public = 114,
      Interface = 115,
      Package = 116,
      Protected = 117,
      Static = 118,
      Identifier = 119,
      StringLiteral = 120,
      BackTick = 121,
      WhiteSpaces = 122,
      LineTerminator = 123,
      HtmlComment = 124,
      CDataComment = 125,
      UnexpectedCharacter = 126,
      TemplateStringStartExpression = 127,
      TemplateStringAtom = 128;
  public static final int RULE_program = 0,
      RULE_sourceElement = 1,
      RULE_statement = 2,
      RULE_block = 3,
      RULE_statementList = 4,
      RULE_importStatement = 5,
      RULE_importFromBlock = 6,
      RULE_moduleItems = 7,
      RULE_importDefault = 8,
      RULE_importNamespace = 9,
      RULE_importFrom = 10,
      RULE_aliasName = 11,
      RULE_exportStatement = 12,
      RULE_exportFromBlock = 13,
      RULE_declaration = 14,
      RULE_variableStatement = 15,
      RULE_variableDeclarationList = 16,
      RULE_variableDeclaration = 17,
      RULE_emptyStatement_ = 18,
      RULE_expressionStatement = 19,
      RULE_ifStatement = 20,
      RULE_iterationStatement = 21,
      RULE_varModifier = 22,
      RULE_continueStatement = 23,
      RULE_breakStatement = 24,
      RULE_returnStatement = 25,
      RULE_yieldStatement = 26,
      RULE_withStatement = 27,
      RULE_switchStatement = 28,
      RULE_caseBlock = 29,
      RULE_caseClauses = 30,
      RULE_caseClause = 31,
      RULE_defaultClause = 32,
      RULE_labelledStatement = 33,
      RULE_throwStatement = 34,
      RULE_tryStatement = 35,
      RULE_catchProduction = 36,
      RULE_finallyProduction = 37,
      RULE_debuggerStatement = 38,
      RULE_functionDeclaration = 39,
      RULE_classDeclaration = 40,
      RULE_classTail = 41,
      RULE_classElement = 42,
      RULE_methodDefinition = 43,
      RULE_formalParameterList = 44,
      RULE_formalParameterArg = 45,
      RULE_lastFormalParameterArg = 46,
      RULE_functionBody = 47,
      RULE_sourceElements = 48,
      RULE_arrayLiteral = 49,
      RULE_elementList = 50,
      RULE_arrayElement = 51,
      RULE_propertyAssignment = 52,
      RULE_propertyName = 53,
      RULE_arguments = 54,
      RULE_argument = 55,
      RULE_expressionSequence = 56,
      RULE_singleExpression = 57,
      RULE_assignable = 58,
      RULE_objectLiteral = 59,
      RULE_anonymousFunction = 60,
      RULE_arrowFunctionParameters = 61,
      RULE_arrowFunctionBody = 62,
      RULE_assignmentOperator = 63,
      RULE_literal = 64,
      RULE_templateStringLiteral = 65,
      RULE_templateStringAtom = 66,
      RULE_numericLiteral = 67,
      RULE_bigintLiteral = 68,
      RULE_getter = 69,
      RULE_setter = 70,
      RULE_identifierName = 71,
      RULE_identifier = 72,
      RULE_reservedWord = 73,
      RULE_keyword = 74,
      RULE_let_ = 75,
      RULE_eos = 76;

  private static String[] makeRuleNames() {
    return new String[] {
      "program",
      "sourceElement",
      "statement",
      "block",
      "statementList",
      "importStatement",
      "importFromBlock",
      "moduleItems",
      "importDefault",
      "importNamespace",
      "importFrom",
      "aliasName",
      "exportStatement",
      "exportFromBlock",
      "declaration",
      "variableStatement",
      "variableDeclarationList",
      "variableDeclaration",
      "emptyStatement_",
      "expressionStatement",
      "ifStatement",
      "iterationStatement",
      "varModifier",
      "continueStatement",
      "breakStatement",
      "returnStatement",
      "yieldStatement",
      "withStatement",
      "switchStatement",
      "caseBlock",
      "caseClauses",
      "caseClause",
      "defaultClause",
      "labelledStatement",
      "throwStatement",
      "tryStatement",
      "catchProduction",
      "finallyProduction",
      "debuggerStatement",
      "functionDeclaration",
      "classDeclaration",
      "classTail",
      "classElement",
      "methodDefinition",
      "formalParameterList",
      "formalParameterArg",
      "lastFormalParameterArg",
      "functionBody",
      "sourceElements",
      "arrayLiteral",
      "elementList",
      "arrayElement",
      "propertyAssignment",
      "propertyName",
      "arguments",
      "argument",
      "expressionSequence",
      "singleExpression",
      "assignable",
      "objectLiteral",
      "anonymousFunction",
      "arrowFunctionParameters",
      "arrowFunctionBody",
      "assignmentOperator",
      "literal",
      "templateStringLiteral",
      "templateStringAtom",
      "numericLiteral",
      "bigintLiteral",
      "getter",
      "setter",
      "identifierName",
      "identifier",
      "reservedWord",
      "keyword",
      "let_",
      "eos"
    };
  }

  public static final String[] ruleNames = makeRuleNames();

  private static String[] makeLiteralNames() {
    return new String[] {
      null,
      "'/*'",
      null,
      null,
      null,
      "'['",
      "']'",
      "'('",
      "')'",
      "'{'",
      null,
      "'}'",
      "';'",
      "','",
      "'='",
      "'?'",
      "'?.'",
      "':'",
      "'...'",
      "'.'",
      "'++'",
      "'--'",
      "'+'",
      "'-'",
      "'~'",
      "'!'",
      "'*'",
      "'/'",
      "'%'",
      "'**'",
      "'??'",
      "'#'",
      "'>>'",
      "'<<'",
      "'>>>'",
      "'<'",
      "'>'",
      "'<='",
      "'>='",
      "'=='",
      "'!='",
      "'==='",
      "'!=='",
      "'&'",
      "'^'",
      "'|'",
      "'&&'",
      "'||'",
      "'*='",
      "'/='",
      "'%='",
      "'+='",
      "'-='",
      "'<<='",
      "'>>='",
      "'>>>='",
      "'&='",
      "'^='",
      "'|='",
      "'**='",
      "'=>'",
      "'null'",
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      "'break'",
      "'do'",
      "'instanceof'",
      "'typeof'",
      "'case'",
      "'else'",
      "'new'",
      "'var'",
      "'catch'",
      "'finally'",
      "'return'",
      "'void'",
      "'continue'",
      "'for'",
      "'switch'",
      "'while'",
      "'debugger'",
      "'function'",
      "'this'",
      "'with'",
      "'default'",
      "'if'",
      "'throw'",
      "'delete'",
      "'in'",
      "'try'",
      "'as'",
      "'from'",
      "'class'",
      "'enum'",
      "'extends'",
      "'super'",
      "'const'",
      "'export'",
      "'import'",
      "'async'",
      "'await'",
      "'yield'",
      "'implements'",
      null,
      null,
      "'private'",
      "'public'",
      "'interface'",
      "'package'",
      "'protected'",
      "'static'",
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      null,
      "'${'"
    };
  }

  private static final String[] _LITERAL_NAMES = makeLiteralNames();

  private static String[] makeSymbolicNames() {
    return new String[] {
      null,
      "MultiLineCommentOpen",
      "MultiLineComment",
      "SingleLineComment",
      "RegularExpressionLiteral",
      "OpenBracket",
      "CloseBracket",
      "OpenParen",
      "CloseParen",
      "OpenBrace",
      "TemplateCloseBrace",
      "CloseBrace",
      "SemiColon",
      "Comma",
      "Assign",
      "QuestionMark",
      "QuestionMarkDot",
      "Colon",
      "Ellipsis",
      "Dot",
      "PlusPlus",
      "MinusMinus",
      "Plus",
      "Minus",
      "BitNot",
      "Not",
      "Multiply",
      "Divide",
      "Modulus",
      "Power",
      "NullCoalesce",
      "Hashtag",
      "RightShiftArithmetic",
      "LeftShiftArithmetic",
      "RightShiftLogical",
      "LessThan",
      "MoreThan",
      "LessThanEquals",
      "GreaterThanEquals",
      "Equals_",
      "NotEquals",
      "IdentityEquals",
      "IdentityNotEquals",
      "BitAnd",
      "BitXOr",
      "BitOr",
      "And",
      "Or",
      "MultiplyAssign",
      "DivideAssign",
      "ModulusAssign",
      "PlusAssign",
      "MinusAssign",
      "LeftShiftArithmeticAssign",
      "RightShiftArithmeticAssign",
      "RightShiftLogicalAssign",
      "BitAndAssign",
      "BitXorAssign",
      "BitOrAssign",
      "PowerAssign",
      "ARROW",
      "NullLiteral",
      "BooleanLiteral",
      "DecimalLiteral",
      "HexIntegerLiteral",
      "OctalIntegerLiteral",
      "OctalIntegerLiteral2",
      "BinaryIntegerLiteral",
      "BigHexIntegerLiteral",
      "BigOctalIntegerLiteral",
      "BigBinaryIntegerLiteral",
      "BigDecimalIntegerLiteral",
      "Break",
      "Do",
      "Instanceof",
      "Typeof",
      "Case",
      "Else",
      "New",
      "Var",
      "Catch",
      "Finally",
      "Return",
      "Void",
      "Continue",
      "For",
      "Switch",
      "While",
      "Debugger",
      "Function_",
      "This",
      "With",
      "Default",
      "If",
      "Throw",
      "Delete",
      "In",
      "Try",
      "As",
      "From",
      "Class",
      "Enum",
      "Extends",
      "Super",
      "Const",
      "Export",
      "Import",
      "Async",
      "Await",
      "Yield",
      "Implements",
      "StrictLet",
      "NonStrictLet",
      "Private",
      "Public",
      "Interface",
      "Package",
      "Protected",
      "Static",
      "Identifier",
      "StringLiteral",
      "BackTick",
      "WhiteSpaces",
      "LineTerminator",
      "HtmlComment",
      "CDataComment",
      "UnexpectedCharacter",
      "TemplateStringStartExpression",
      "TemplateStringAtom"
    };
  }

  private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
  public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

  /**
   * @deprecated Use {@link #VOCABULARY} instead.
   */
  @Deprecated public static final String[] tokenNames;

  static {
    tokenNames = new String[_SYMBOLIC_NAMES.length];
    for (int i = 0; i < tokenNames.length; i++) {
      tokenNames[i] = VOCABULARY.getLiteralName(i);
      if (tokenNames[i] == null) {
        tokenNames[i] = VOCABULARY.getSymbolicName(i);
      }

      if (tokenNames[i] == null) {
        tokenNames[i] = "<INVALID>";
      }
    }
  }

  @Override
  @Deprecated
  public String[] getTokenNames() {
    return tokenNames;
  }

  @Override
  public Vocabulary getVocabulary() {
    return VOCABULARY;
  }

  @Override
  public String getGrammarFileName() {
    return "java-escape";
  }

  @Override
  public String[] getRuleNames() {
    return ruleNames;
  }

  @Override
  public String getSerializedATN() {
    return _serializedATN;
  }

  @Override
  public ATN getATN() {
    return _ATN;
  }

  public JavaScriptParser(TokenStream input) {
    super(input);
    _interp = new ParserATNSimulator(this, _ATN, _decisionToDFA, _sharedContextCache);
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ProgramContext extends ParserRuleContext {
    public TerminalNode EOF() {
      return getToken(JavaScriptParser.EOF, 0);
    }

    public SourceElementsContext sourceElements() {
      return getRuleContext(SourceElementsContext.class, 0);
    }

    public ProgramContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_program;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterProgram(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitProgram(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitProgram(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ProgramContext program() throws RecognitionException {
    ProgramContext _localctx = new ProgramContext(_ctx, getState());
    enterRule(_localctx, 0, RULE_program);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(155);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 0, _ctx)) {
          case 1:
            {
              setState(154);
              sourceElements();
            }
            break;
        }
        setState(157);
        match(EOF);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class SourceElementContext extends ParserRuleContext {
    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public SourceElementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_sourceElement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterSourceElement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitSourceElement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitSourceElement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final SourceElementContext sourceElement() throws RecognitionException {
    SourceElementContext _localctx = new SourceElementContext(_ctx, getState());
    enterRule(_localctx, 2, RULE_sourceElement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(159);
        statement();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class StatementContext extends ParserRuleContext {
    public BlockContext block() {
      return getRuleContext(BlockContext.class, 0);
    }

    public VariableStatementContext variableStatement() {
      return getRuleContext(VariableStatementContext.class, 0);
    }

    public ImportStatementContext importStatement() {
      return getRuleContext(ImportStatementContext.class, 0);
    }

    public ExportStatementContext exportStatement() {
      return getRuleContext(ExportStatementContext.class, 0);
    }

    public EmptyStatement_Context emptyStatement_() {
      return getRuleContext(EmptyStatement_Context.class, 0);
    }

    public ClassDeclarationContext classDeclaration() {
      return getRuleContext(ClassDeclarationContext.class, 0);
    }

    public ExpressionStatementContext expressionStatement() {
      return getRuleContext(ExpressionStatementContext.class, 0);
    }

    public IfStatementContext ifStatement() {
      return getRuleContext(IfStatementContext.class, 0);
    }

    public IterationStatementContext iterationStatement() {
      return getRuleContext(IterationStatementContext.class, 0);
    }

    public ContinueStatementContext continueStatement() {
      return getRuleContext(ContinueStatementContext.class, 0);
    }

    public BreakStatementContext breakStatement() {
      return getRuleContext(BreakStatementContext.class, 0);
    }

    public ReturnStatementContext returnStatement() {
      return getRuleContext(ReturnStatementContext.class, 0);
    }

    public YieldStatementContext yieldStatement() {
      return getRuleContext(YieldStatementContext.class, 0);
    }

    public WithStatementContext withStatement() {
      return getRuleContext(WithStatementContext.class, 0);
    }

    public LabelledStatementContext labelledStatement() {
      return getRuleContext(LabelledStatementContext.class, 0);
    }

    public SwitchStatementContext switchStatement() {
      return getRuleContext(SwitchStatementContext.class, 0);
    }

    public ThrowStatementContext throwStatement() {
      return getRuleContext(ThrowStatementContext.class, 0);
    }

    public TryStatementContext tryStatement() {
      return getRuleContext(TryStatementContext.class, 0);
    }

    public DebuggerStatementContext debuggerStatement() {
      return getRuleContext(DebuggerStatementContext.class, 0);
    }

    public FunctionDeclarationContext functionDeclaration() {
      return getRuleContext(FunctionDeclarationContext.class, 0);
    }

    public StatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_statement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final StatementContext statement() throws RecognitionException {
    StatementContext _localctx = new StatementContext(_ctx, getState());
    enterRule(_localctx, 4, RULE_statement);
    try {
      setState(181);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 1, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(161);
            block();
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(162);
            variableStatement();
          }
          break;
        case 3:
          enterOuterAlt(_localctx, 3);
          {
            setState(163);
            importStatement();
          }
          break;
        case 4:
          enterOuterAlt(_localctx, 4);
          {
            setState(164);
            exportStatement();
          }
          break;
        case 5:
          enterOuterAlt(_localctx, 5);
          {
            setState(165);
            emptyStatement_();
          }
          break;
        case 6:
          enterOuterAlt(_localctx, 6);
          {
            setState(166);
            classDeclaration();
          }
          break;
        case 7:
          enterOuterAlt(_localctx, 7);
          {
            setState(167);
            expressionStatement();
          }
          break;
        case 8:
          enterOuterAlt(_localctx, 8);
          {
            setState(168);
            ifStatement();
          }
          break;
        case 9:
          enterOuterAlt(_localctx, 9);
          {
            setState(169);
            iterationStatement();
          }
          break;
        case 10:
          enterOuterAlt(_localctx, 10);
          {
            setState(170);
            continueStatement();
          }
          break;
        case 11:
          enterOuterAlt(_localctx, 11);
          {
            setState(171);
            breakStatement();
          }
          break;
        case 12:
          enterOuterAlt(_localctx, 12);
          {
            setState(172);
            returnStatement();
          }
          break;
        case 13:
          enterOuterAlt(_localctx, 13);
          {
            setState(173);
            yieldStatement();
          }
          break;
        case 14:
          enterOuterAlt(_localctx, 14);
          {
            setState(174);
            withStatement();
          }
          break;
        case 15:
          enterOuterAlt(_localctx, 15);
          {
            setState(175);
            labelledStatement();
          }
          break;
        case 16:
          enterOuterAlt(_localctx, 16);
          {
            setState(176);
            switchStatement();
          }
          break;
        case 17:
          enterOuterAlt(_localctx, 17);
          {
            setState(177);
            throwStatement();
          }
          break;
        case 18:
          enterOuterAlt(_localctx, 18);
          {
            setState(178);
            tryStatement();
          }
          break;
        case 19:
          enterOuterAlt(_localctx, 19);
          {
            setState(179);
            debuggerStatement();
          }
          break;
        case 20:
          enterOuterAlt(_localctx, 20);
          {
            setState(180);
            functionDeclaration();
          }
          break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class BlockContext extends ParserRuleContext {
    public TerminalNode OpenBrace() {
      return getToken(JavaScriptParser.OpenBrace, 0);
    }

    public TerminalNode CloseBrace() {
      return getToken(JavaScriptParser.CloseBrace, 0);
    }

    public StatementListContext statementList() {
      return getRuleContext(StatementListContext.class, 0);
    }

    public BlockContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_block;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterBlock(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitBlock(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitBlock(this);
      else return visitor.visitChildren(this);
    }
  }

  public final BlockContext block() throws RecognitionException {
    BlockContext _localctx = new BlockContext(_ctx, getState());
    enterRule(_localctx, 6, RULE_block);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(183);
        match(OpenBrace);
        setState(185);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 2, _ctx)) {
          case 1:
            {
              setState(184);
              statementList();
            }
            break;
        }
        setState(187);
        match(CloseBrace);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class StatementListContext extends ParserRuleContext {
    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public StatementListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_statementList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterStatementList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitStatementList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitStatementList(this);
      else return visitor.visitChildren(this);
    }
  }

  public final StatementListContext statementList() throws RecognitionException {
    StatementListContext _localctx = new StatementListContext(_ctx, getState());
    enterRule(_localctx, 8, RULE_statementList);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(190);
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
            case 1:
              {
                {
                  setState(189);
                  statement();
                }
              }
              break;
            default:
              throw new NoViableAltException(this);
          }
          setState(192);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 3, _ctx);
        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ImportStatementContext extends ParserRuleContext {
    public TerminalNode Import() {
      return getToken(JavaScriptParser.Import, 0);
    }

    public ImportFromBlockContext importFromBlock() {
      return getRuleContext(ImportFromBlockContext.class, 0);
    }

    public ImportStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_importStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterImportStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitImportStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitImportStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ImportStatementContext importStatement() throws RecognitionException {
    ImportStatementContext _localctx = new ImportStatementContext(_ctx, getState());
    enterRule(_localctx, 10, RULE_importStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(194);
        match(Import);
        setState(195);
        importFromBlock();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ImportFromBlockContext extends ParserRuleContext {
    public ImportFromContext importFrom() {
      return getRuleContext(ImportFromContext.class, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public ImportNamespaceContext importNamespace() {
      return getRuleContext(ImportNamespaceContext.class, 0);
    }

    public ModuleItemsContext moduleItems() {
      return getRuleContext(ModuleItemsContext.class, 0);
    }

    public ImportDefaultContext importDefault() {
      return getRuleContext(ImportDefaultContext.class, 0);
    }

    public TerminalNode StringLiteral() {
      return getToken(JavaScriptParser.StringLiteral, 0);
    }

    public ImportFromBlockContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_importFromBlock;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterImportFromBlock(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitImportFromBlock(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitImportFromBlock(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ImportFromBlockContext importFromBlock() throws RecognitionException {
    ImportFromBlockContext _localctx = new ImportFromBlockContext(_ctx, getState());
    enterRule(_localctx, 12, RULE_importFromBlock);
    try {
      setState(209);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case OpenBrace:
        case Multiply:
        case NullLiteral:
        case BooleanLiteral:
        case Break:
        case Do:
        case Instanceof:
        case Typeof:
        case Case:
        case Else:
        case New:
        case Var:
        case Catch:
        case Finally:
        case Return:
        case Void:
        case Continue:
        case For:
        case Switch:
        case While:
        case Debugger:
        case Function_:
        case This:
        case With:
        case Default:
        case If:
        case Throw:
        case Delete:
        case In:
        case Try:
        case As:
        case From:
        case Class:
        case Enum:
        case Extends:
        case Super:
        case Const:
        case Export:
        case Import:
        case Async:
        case Await:
        case Yield:
        case Implements:
        case StrictLet:
        case NonStrictLet:
        case Private:
        case Public:
        case Interface:
        case Package:
        case Protected:
        case Static:
        case Identifier:
          enterOuterAlt(_localctx, 1);
          {
            setState(198);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 4, _ctx)) {
              case 1:
                {
                  setState(197);
                  importDefault();
                }
                break;
            }
            setState(202);
            _errHandler.sync(this);
            switch (_input.LA(1)) {
              case Multiply:
              case NullLiteral:
              case BooleanLiteral:
              case Break:
              case Do:
              case Instanceof:
              case Typeof:
              case Case:
              case Else:
              case New:
              case Var:
              case Catch:
              case Finally:
              case Return:
              case Void:
              case Continue:
              case For:
              case Switch:
              case While:
              case Debugger:
              case Function_:
              case This:
              case With:
              case Default:
              case If:
              case Throw:
              case Delete:
              case In:
              case Try:
              case As:
              case From:
              case Class:
              case Enum:
              case Extends:
              case Super:
              case Const:
              case Export:
              case Import:
              case Async:
              case Await:
              case Yield:
              case Implements:
              case StrictLet:
              case NonStrictLet:
              case Private:
              case Public:
              case Interface:
              case Package:
              case Protected:
              case Static:
              case Identifier:
                {
                  setState(200);
                  importNamespace();
                }
                break;
              case OpenBrace:
                {
                  setState(201);
                  moduleItems();
                }
                break;
              default:
                throw new NoViableAltException(this);
            }
            setState(204);
            importFrom();
            setState(205);
            eos();
          }
          break;
        case StringLiteral:
          enterOuterAlt(_localctx, 2);
          {
            setState(207);
            match(StringLiteral);
            setState(208);
            eos();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ModuleItemsContext extends ParserRuleContext {
    public TerminalNode OpenBrace() {
      return getToken(JavaScriptParser.OpenBrace, 0);
    }

    public TerminalNode CloseBrace() {
      return getToken(JavaScriptParser.CloseBrace, 0);
    }

    public List<AliasNameContext> aliasName() {
      return getRuleContexts(AliasNameContext.class);
    }

    public AliasNameContext aliasName(int i) {
      return getRuleContext(AliasNameContext.class, i);
    }

    public List<TerminalNode> Comma() {
      return getTokens(JavaScriptParser.Comma);
    }

    public TerminalNode Comma(int i) {
      return getToken(JavaScriptParser.Comma, i);
    }

    public ModuleItemsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_moduleItems;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterModuleItems(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitModuleItems(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitModuleItems(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ModuleItemsContext moduleItems() throws RecognitionException {
    ModuleItemsContext _localctx = new ModuleItemsContext(_ctx, getState());
    enterRule(_localctx, 14, RULE_moduleItems);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(211);
        match(OpenBrace);
        setState(217);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(212);
                aliasName();
                setState(213);
                match(Comma);
              }
            }
          }
          setState(219);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 7, _ctx);
        }
        setState(224);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if ((((_la - 61)) & ~0x3f) == 0 && ((1L << (_la - 61)) & 576460752303421443L) != 0) {
          {
            setState(220);
            aliasName();
            setState(222);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == Comma) {
              {
                setState(221);
                match(Comma);
              }
            }
          }
        }

        setState(226);
        match(CloseBrace);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ImportDefaultContext extends ParserRuleContext {
    public AliasNameContext aliasName() {
      return getRuleContext(AliasNameContext.class, 0);
    }

    public TerminalNode Comma() {
      return getToken(JavaScriptParser.Comma, 0);
    }

    public ImportDefaultContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_importDefault;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterImportDefault(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitImportDefault(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitImportDefault(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ImportDefaultContext importDefault() throws RecognitionException {
    ImportDefaultContext _localctx = new ImportDefaultContext(_ctx, getState());
    enterRule(_localctx, 16, RULE_importDefault);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(228);
        aliasName();
        setState(229);
        match(Comma);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ImportNamespaceContext extends ParserRuleContext {
    public TerminalNode Multiply() {
      return getToken(JavaScriptParser.Multiply, 0);
    }

    public List<IdentifierNameContext> identifierName() {
      return getRuleContexts(IdentifierNameContext.class);
    }

    public IdentifierNameContext identifierName(int i) {
      return getRuleContext(IdentifierNameContext.class, i);
    }

    public TerminalNode As() {
      return getToken(JavaScriptParser.As, 0);
    }

    public ImportNamespaceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_importNamespace;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterImportNamespace(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitImportNamespace(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitImportNamespace(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ImportNamespaceContext importNamespace() throws RecognitionException {
    ImportNamespaceContext _localctx = new ImportNamespaceContext(_ctx, getState());
    enterRule(_localctx, 18, RULE_importNamespace);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(233);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case Multiply:
            {
              setState(231);
              match(Multiply);
            }
            break;
          case NullLiteral:
          case BooleanLiteral:
          case Break:
          case Do:
          case Instanceof:
          case Typeof:
          case Case:
          case Else:
          case New:
          case Var:
          case Catch:
          case Finally:
          case Return:
          case Void:
          case Continue:
          case For:
          case Switch:
          case While:
          case Debugger:
          case Function_:
          case This:
          case With:
          case Default:
          case If:
          case Throw:
          case Delete:
          case In:
          case Try:
          case As:
          case From:
          case Class:
          case Enum:
          case Extends:
          case Super:
          case Const:
          case Export:
          case Import:
          case Async:
          case Await:
          case Yield:
          case Implements:
          case StrictLet:
          case NonStrictLet:
          case Private:
          case Public:
          case Interface:
          case Package:
          case Protected:
          case Static:
          case Identifier:
            {
              setState(232);
              identifierName();
            }
            break;
          default:
            throw new NoViableAltException(this);
        }
        setState(237);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == As) {
          {
            setState(235);
            match(As);
            setState(236);
            identifierName();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ImportFromContext extends ParserRuleContext {
    public TerminalNode From() {
      return getToken(JavaScriptParser.From, 0);
    }

    public TerminalNode StringLiteral() {
      return getToken(JavaScriptParser.StringLiteral, 0);
    }

    public ImportFromContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_importFrom;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterImportFrom(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitImportFrom(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitImportFrom(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ImportFromContext importFrom() throws RecognitionException {
    ImportFromContext _localctx = new ImportFromContext(_ctx, getState());
    enterRule(_localctx, 20, RULE_importFrom);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(239);
        match(From);
        setState(240);
        match(StringLiteral);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class AliasNameContext extends ParserRuleContext {
    public List<IdentifierNameContext> identifierName() {
      return getRuleContexts(IdentifierNameContext.class);
    }

    public IdentifierNameContext identifierName(int i) {
      return getRuleContext(IdentifierNameContext.class, i);
    }

    public TerminalNode As() {
      return getToken(JavaScriptParser.As, 0);
    }

    public AliasNameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_aliasName;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterAliasName(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitAliasName(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitAliasName(this);
      else return visitor.visitChildren(this);
    }
  }

  public final AliasNameContext aliasName() throws RecognitionException {
    AliasNameContext _localctx = new AliasNameContext(_ctx, getState());
    enterRule(_localctx, 22, RULE_aliasName);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(242);
        identifierName();
        setState(245);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == As) {
          {
            setState(243);
            match(As);
            setState(244);
            identifierName();
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ExportStatementContext extends ParserRuleContext {
    public ExportStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_exportStatement;
    }

    public ExportStatementContext() {}

    public void copyFrom(ExportStatementContext ctx) {
      super.copyFrom(ctx);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ExportDefaultDeclarationContext extends ExportStatementContext {
    public TerminalNode Export() {
      return getToken(JavaScriptParser.Export, 0);
    }

    public TerminalNode Default() {
      return getToken(JavaScriptParser.Default, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public ExportDefaultDeclarationContext(ExportStatementContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterExportDefaultDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitExportDefaultDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitExportDefaultDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ExportDeclarationContext extends ExportStatementContext {
    public TerminalNode Export() {
      return getToken(JavaScriptParser.Export, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public ExportFromBlockContext exportFromBlock() {
      return getRuleContext(ExportFromBlockContext.class, 0);
    }

    public DeclarationContext declaration() {
      return getRuleContext(DeclarationContext.class, 0);
    }

    public ExportDeclarationContext(ExportStatementContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterExportDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitExportDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitExportDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ExportStatementContext exportStatement() throws RecognitionException {
    ExportStatementContext _localctx = new ExportStatementContext(_ctx, getState());
    enterRule(_localctx, 24, RULE_exportStatement);
    try {
      setState(259);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 14, _ctx)) {
        case 1:
          _localctx = new ExportDeclarationContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(247);
            match(Export);
            setState(250);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 13, _ctx)) {
              case 1:
                {
                  setState(248);
                  exportFromBlock();
                }
                break;
              case 2:
                {
                  setState(249);
                  declaration();
                }
                break;
            }
            setState(252);
            eos();
          }
          break;
        case 2:
          _localctx = new ExportDefaultDeclarationContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(254);
            match(Export);
            setState(255);
            match(Default);
            setState(256);
            singleExpression(0);
            setState(257);
            eos();
          }
          break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ExportFromBlockContext extends ParserRuleContext {
    public ImportNamespaceContext importNamespace() {
      return getRuleContext(ImportNamespaceContext.class, 0);
    }

    public ImportFromContext importFrom() {
      return getRuleContext(ImportFromContext.class, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public ModuleItemsContext moduleItems() {
      return getRuleContext(ModuleItemsContext.class, 0);
    }

    public ExportFromBlockContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_exportFromBlock;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterExportFromBlock(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitExportFromBlock(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitExportFromBlock(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ExportFromBlockContext exportFromBlock() throws RecognitionException {
    ExportFromBlockContext _localctx = new ExportFromBlockContext(_ctx, getState());
    enterRule(_localctx, 26, RULE_exportFromBlock);
    try {
      setState(271);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case Multiply:
        case NullLiteral:
        case BooleanLiteral:
        case Break:
        case Do:
        case Instanceof:
        case Typeof:
        case Case:
        case Else:
        case New:
        case Var:
        case Catch:
        case Finally:
        case Return:
        case Void:
        case Continue:
        case For:
        case Switch:
        case While:
        case Debugger:
        case Function_:
        case This:
        case With:
        case Default:
        case If:
        case Throw:
        case Delete:
        case In:
        case Try:
        case As:
        case From:
        case Class:
        case Enum:
        case Extends:
        case Super:
        case Const:
        case Export:
        case Import:
        case Async:
        case Await:
        case Yield:
        case Implements:
        case StrictLet:
        case NonStrictLet:
        case Private:
        case Public:
        case Interface:
        case Package:
        case Protected:
        case Static:
        case Identifier:
          enterOuterAlt(_localctx, 1);
          {
            setState(261);
            importNamespace();
            setState(262);
            importFrom();
            setState(263);
            eos();
          }
          break;
        case OpenBrace:
          enterOuterAlt(_localctx, 2);
          {
            setState(265);
            moduleItems();
            setState(267);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 15, _ctx)) {
              case 1:
                {
                  setState(266);
                  importFrom();
                }
                break;
            }
            setState(269);
            eos();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class DeclarationContext extends ParserRuleContext {
    public VariableStatementContext variableStatement() {
      return getRuleContext(VariableStatementContext.class, 0);
    }

    public ClassDeclarationContext classDeclaration() {
      return getRuleContext(ClassDeclarationContext.class, 0);
    }

    public FunctionDeclarationContext functionDeclaration() {
      return getRuleContext(FunctionDeclarationContext.class, 0);
    }

    public DeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_declaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public final DeclarationContext declaration() throws RecognitionException {
    DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
    enterRule(_localctx, 28, RULE_declaration);
    try {
      setState(276);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case Var:
        case Const:
        case StrictLet:
        case NonStrictLet:
          enterOuterAlt(_localctx, 1);
          {
            setState(273);
            variableStatement();
          }
          break;
        case Class:
          enterOuterAlt(_localctx, 2);
          {
            setState(274);
            classDeclaration();
          }
          break;
        case Function_:
        case Async:
          enterOuterAlt(_localctx, 3);
          {
            setState(275);
            functionDeclaration();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class VariableStatementContext extends ParserRuleContext {
    public VariableDeclarationListContext variableDeclarationList() {
      return getRuleContext(VariableDeclarationListContext.class, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public VariableStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_variableStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterVariableStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitVariableStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitVariableStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final VariableStatementContext variableStatement() throws RecognitionException {
    VariableStatementContext _localctx = new VariableStatementContext(_ctx, getState());
    enterRule(_localctx, 30, RULE_variableStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(278);
        variableDeclarationList();
        setState(279);
        eos();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class VariableDeclarationListContext extends ParserRuleContext {
    public VarModifierContext varModifier() {
      return getRuleContext(VarModifierContext.class, 0);
    }

    public List<VariableDeclarationContext> variableDeclaration() {
      return getRuleContexts(VariableDeclarationContext.class);
    }

    public VariableDeclarationContext variableDeclaration(int i) {
      return getRuleContext(VariableDeclarationContext.class, i);
    }

    public List<TerminalNode> Comma() {
      return getTokens(JavaScriptParser.Comma);
    }

    public TerminalNode Comma(int i) {
      return getToken(JavaScriptParser.Comma, i);
    }

    public VariableDeclarationListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_variableDeclarationList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterVariableDeclarationList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitVariableDeclarationList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitVariableDeclarationList(this);
      else return visitor.visitChildren(this);
    }
  }

  public final VariableDeclarationListContext variableDeclarationList()
      throws RecognitionException {
    VariableDeclarationListContext _localctx = new VariableDeclarationListContext(_ctx, getState());
    enterRule(_localctx, 32, RULE_variableDeclarationList);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(281);
        varModifier();
        setState(282);
        variableDeclaration();
        setState(287);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(283);
                match(Comma);
                setState(284);
                variableDeclaration();
              }
            }
          }
          setState(289);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 18, _ctx);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class VariableDeclarationContext extends ParserRuleContext {
    public AssignableContext assignable() {
      return getRuleContext(AssignableContext.class, 0);
    }

    public TerminalNode Assign() {
      return getToken(JavaScriptParser.Assign, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public VariableDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_variableDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterVariableDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitVariableDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitVariableDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public final VariableDeclarationContext variableDeclaration() throws RecognitionException {
    VariableDeclarationContext _localctx = new VariableDeclarationContext(_ctx, getState());
    enterRule(_localctx, 34, RULE_variableDeclaration);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(290);
        assignable();
        setState(293);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 19, _ctx)) {
          case 1:
            {
              setState(291);
              match(Assign);
              setState(292);
              singleExpression(0);
            }
            break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class EmptyStatement_Context extends ParserRuleContext {
    public TerminalNode SemiColon() {
      return getToken(JavaScriptParser.SemiColon, 0);
    }

    public EmptyStatement_Context(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_emptyStatement_;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterEmptyStatement_(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitEmptyStatement_(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitEmptyStatement_(this);
      else return visitor.visitChildren(this);
    }
  }

  public final EmptyStatement_Context emptyStatement_() throws RecognitionException {
    EmptyStatement_Context _localctx = new EmptyStatement_Context(_ctx, getState());
    enterRule(_localctx, 36, RULE_emptyStatement_);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(295);
        match(SemiColon);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ExpressionStatementContext extends ParserRuleContext {
    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public ExpressionStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_expressionStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterExpressionStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitExpressionStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitExpressionStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ExpressionStatementContext expressionStatement() throws RecognitionException {
    ExpressionStatementContext _localctx = new ExpressionStatementContext(_ctx, getState());
    enterRule(_localctx, 38, RULE_expressionStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(297);
        if (!(this.notOpenBraceAndNotFunction()))
          throw new FailedPredicateException(this, "this.notOpenBraceAndNotFunction()");
        setState(298);
        expressionSequence();
        setState(299);
        eos();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class IfStatementContext extends ParserRuleContext {
    public TerminalNode If() {
      return getToken(JavaScriptParser.If, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public List<StatementContext> statement() {
      return getRuleContexts(StatementContext.class);
    }

    public StatementContext statement(int i) {
      return getRuleContext(StatementContext.class, i);
    }

    public TerminalNode Else() {
      return getToken(JavaScriptParser.Else, 0);
    }

    public IfStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_ifStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterIfStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitIfStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitIfStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final IfStatementContext ifStatement() throws RecognitionException {
    IfStatementContext _localctx = new IfStatementContext(_ctx, getState());
    enterRule(_localctx, 40, RULE_ifStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(301);
        match(If);
        setState(302);
        match(OpenParen);
        setState(303);
        expressionSequence();
        setState(304);
        match(CloseParen);
        setState(305);
        statement();
        setState(308);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 20, _ctx)) {
          case 1:
            {
              setState(306);
              match(Else);
              setState(307);
              statement();
            }
            break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class IterationStatementContext extends ParserRuleContext {
    public IterationStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_iterationStatement;
    }

    public IterationStatementContext() {}

    public void copyFrom(IterationStatementContext ctx) {
      super.copyFrom(ctx);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class DoStatementContext extends IterationStatementContext {
    public TerminalNode Do() {
      return getToken(JavaScriptParser.Do, 0);
    }

    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public TerminalNode While() {
      return getToken(JavaScriptParser.While, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public DoStatementContext(IterationStatementContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterDoStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitDoStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitDoStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class WhileStatementContext extends IterationStatementContext {
    public TerminalNode While() {
      return getToken(JavaScriptParser.While, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public WhileStatementContext(IterationStatementContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterWhileStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitWhileStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitWhileStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ForStatementContext extends IterationStatementContext {
    public TerminalNode For() {
      return getToken(JavaScriptParser.For, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public List<TerminalNode> SemiColon() {
      return getTokens(JavaScriptParser.SemiColon);
    }

    public TerminalNode SemiColon(int i) {
      return getToken(JavaScriptParser.SemiColon, i);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public List<ExpressionSequenceContext> expressionSequence() {
      return getRuleContexts(ExpressionSequenceContext.class);
    }

    public ExpressionSequenceContext expressionSequence(int i) {
      return getRuleContext(ExpressionSequenceContext.class, i);
    }

    public VariableDeclarationListContext variableDeclarationList() {
      return getRuleContext(VariableDeclarationListContext.class, 0);
    }

    public ForStatementContext(IterationStatementContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterForStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitForStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitForStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ForInStatementContext extends IterationStatementContext {
    public TerminalNode For() {
      return getToken(JavaScriptParser.For, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode In() {
      return getToken(JavaScriptParser.In, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public VariableDeclarationListContext variableDeclarationList() {
      return getRuleContext(VariableDeclarationListContext.class, 0);
    }

    public ForInStatementContext(IterationStatementContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterForInStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitForInStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitForInStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ForOfStatementContext extends IterationStatementContext {
    public TerminalNode For() {
      return getToken(JavaScriptParser.For, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public IdentifierContext identifier() {
      return getRuleContext(IdentifierContext.class, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public VariableDeclarationListContext variableDeclarationList() {
      return getRuleContext(VariableDeclarationListContext.class, 0);
    }

    public TerminalNode Await() {
      return getToken(JavaScriptParser.Await, 0);
    }

    public ForOfStatementContext(IterationStatementContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterForOfStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitForOfStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitForOfStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final IterationStatementContext iterationStatement() throws RecognitionException {
    IterationStatementContext _localctx = new IterationStatementContext(_ctx, getState());
    enterRule(_localctx, 42, RULE_iterationStatement);
    int _la;
    try {
      setState(366);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 27, _ctx)) {
        case 1:
          _localctx = new DoStatementContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(310);
            match(Do);
            setState(311);
            statement();
            setState(312);
            match(While);
            setState(313);
            match(OpenParen);
            setState(314);
            expressionSequence();
            setState(315);
            match(CloseParen);
            setState(316);
            eos();
          }
          break;
        case 2:
          _localctx = new WhileStatementContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(318);
            match(While);
            setState(319);
            match(OpenParen);
            setState(320);
            expressionSequence();
            setState(321);
            match(CloseParen);
            setState(322);
            statement();
          }
          break;
        case 3:
          _localctx = new ForStatementContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(324);
            match(For);
            setState(325);
            match(OpenParen);
            setState(328);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 21, _ctx)) {
              case 1:
                {
                  setState(326);
                  expressionSequence();
                }
                break;
              case 2:
                {
                  setState(327);
                  variableDeclarationList();
                }
                break;
            }
            setState(330);
            match(SemiColon);
            setState(332);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (((_la) & ~0x3f) == 0 && ((1L << _la) & -2305843009147632976L) != 0
                || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 252549662710974719L) != 0) {
              {
                setState(331);
                expressionSequence();
              }
            }

            setState(334);
            match(SemiColon);
            setState(336);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (((_la) & ~0x3f) == 0 && ((1L << _la) & -2305843009147632976L) != 0
                || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 252549662710974719L) != 0) {
              {
                setState(335);
                expressionSequence();
              }
            }

            setState(338);
            match(CloseParen);
            setState(339);
            statement();
          }
          break;
        case 4:
          _localctx = new ForInStatementContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(340);
            match(For);
            setState(341);
            match(OpenParen);
            setState(344);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 24, _ctx)) {
              case 1:
                {
                  setState(342);
                  singleExpression(0);
                }
                break;
              case 2:
                {
                  setState(343);
                  variableDeclarationList();
                }
                break;
            }
            setState(346);
            match(In);
            setState(347);
            expressionSequence();
            setState(348);
            match(CloseParen);
            setState(349);
            statement();
          }
          break;
        case 5:
          _localctx = new ForOfStatementContext(_localctx);
          enterOuterAlt(_localctx, 5);
          {
            setState(351);
            match(For);
            setState(353);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == Await) {
              {
                setState(352);
                match(Await);
              }
            }

            setState(355);
            match(OpenParen);
            setState(358);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 26, _ctx)) {
              case 1:
                {
                  setState(356);
                  singleExpression(0);
                }
                break;
              case 2:
                {
                  setState(357);
                  variableDeclarationList();
                }
                break;
            }
            setState(360);
            identifier();
            setState(361);
            if (!(this.p("of"))) throw new FailedPredicateException(this, "this.p(\"of\")");
            setState(362);
            expressionSequence();
            setState(363);
            match(CloseParen);
            setState(364);
            statement();
          }
          break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class VarModifierContext extends ParserRuleContext {
    public TerminalNode Var() {
      return getToken(JavaScriptParser.Var, 0);
    }

    public Let_Context let_() {
      return getRuleContext(Let_Context.class, 0);
    }

    public TerminalNode Const() {
      return getToken(JavaScriptParser.Const, 0);
    }

    public VarModifierContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_varModifier;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterVarModifier(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitVarModifier(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitVarModifier(this);
      else return visitor.visitChildren(this);
    }
  }

  public final VarModifierContext varModifier() throws RecognitionException {
    VarModifierContext _localctx = new VarModifierContext(_ctx, getState());
    enterRule(_localctx, 44, RULE_varModifier);
    try {
      setState(371);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case Var:
          enterOuterAlt(_localctx, 1);
          {
            setState(368);
            match(Var);
          }
          break;
        case StrictLet:
        case NonStrictLet:
          enterOuterAlt(_localctx, 2);
          {
            setState(369);
            let_();
          }
          break;
        case Const:
          enterOuterAlt(_localctx, 3);
          {
            setState(370);
            match(Const);
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ContinueStatementContext extends ParserRuleContext {
    public TerminalNode Continue() {
      return getToken(JavaScriptParser.Continue, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public IdentifierContext identifier() {
      return getRuleContext(IdentifierContext.class, 0);
    }

    public ContinueStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_continueStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterContinueStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitContinueStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitContinueStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ContinueStatementContext continueStatement() throws RecognitionException {
    ContinueStatementContext _localctx = new ContinueStatementContext(_ctx, getState());
    enterRule(_localctx, 46, RULE_continueStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(373);
        match(Continue);
        setState(376);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 29, _ctx)) {
          case 1:
            {
              setState(374);
              if (!(this.notLineTerminator()))
                throw new FailedPredicateException(this, "this.notLineTerminator()");
              setState(375);
              identifier();
            }
            break;
        }
        setState(378);
        eos();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class BreakStatementContext extends ParserRuleContext {
    public TerminalNode Break() {
      return getToken(JavaScriptParser.Break, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public IdentifierContext identifier() {
      return getRuleContext(IdentifierContext.class, 0);
    }

    public BreakStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_breakStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterBreakStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitBreakStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitBreakStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final BreakStatementContext breakStatement() throws RecognitionException {
    BreakStatementContext _localctx = new BreakStatementContext(_ctx, getState());
    enterRule(_localctx, 48, RULE_breakStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(380);
        match(Break);
        setState(383);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 30, _ctx)) {
          case 1:
            {
              setState(381);
              if (!(this.notLineTerminator()))
                throw new FailedPredicateException(this, "this.notLineTerminator()");
              setState(382);
              identifier();
            }
            break;
        }
        setState(385);
        eos();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ReturnStatementContext extends ParserRuleContext {
    public TerminalNode Return() {
      return getToken(JavaScriptParser.Return, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public ReturnStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_returnStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterReturnStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitReturnStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitReturnStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ReturnStatementContext returnStatement() throws RecognitionException {
    ReturnStatementContext _localctx = new ReturnStatementContext(_ctx, getState());
    enterRule(_localctx, 50, RULE_returnStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(387);
        match(Return);
        setState(390);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 31, _ctx)) {
          case 1:
            {
              setState(388);
              if (!(this.notLineTerminator()))
                throw new FailedPredicateException(this, "this.notLineTerminator()");
              setState(389);
              expressionSequence();
            }
            break;
        }
        setState(392);
        eos();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class YieldStatementContext extends ParserRuleContext {
    public TerminalNode Yield() {
      return getToken(JavaScriptParser.Yield, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public YieldStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_yieldStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterYieldStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitYieldStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitYieldStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final YieldStatementContext yieldStatement() throws RecognitionException {
    YieldStatementContext _localctx = new YieldStatementContext(_ctx, getState());
    enterRule(_localctx, 52, RULE_yieldStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(394);
        match(Yield);
        setState(397);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 32, _ctx)) {
          case 1:
            {
              setState(395);
              if (!(this.notLineTerminator()))
                throw new FailedPredicateException(this, "this.notLineTerminator()");
              setState(396);
              expressionSequence();
            }
            break;
        }
        setState(399);
        eos();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class WithStatementContext extends ParserRuleContext {
    public TerminalNode With() {
      return getToken(JavaScriptParser.With, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public WithStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_withStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterWithStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitWithStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitWithStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final WithStatementContext withStatement() throws RecognitionException {
    WithStatementContext _localctx = new WithStatementContext(_ctx, getState());
    enterRule(_localctx, 54, RULE_withStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(401);
        match(With);
        setState(402);
        match(OpenParen);
        setState(403);
        expressionSequence();
        setState(404);
        match(CloseParen);
        setState(405);
        statement();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class SwitchStatementContext extends ParserRuleContext {
    public TerminalNode Switch() {
      return getToken(JavaScriptParser.Switch, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public CaseBlockContext caseBlock() {
      return getRuleContext(CaseBlockContext.class, 0);
    }

    public SwitchStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_switchStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterSwitchStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitSwitchStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitSwitchStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final SwitchStatementContext switchStatement() throws RecognitionException {
    SwitchStatementContext _localctx = new SwitchStatementContext(_ctx, getState());
    enterRule(_localctx, 56, RULE_switchStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(407);
        match(Switch);
        setState(408);
        match(OpenParen);
        setState(409);
        expressionSequence();
        setState(410);
        match(CloseParen);
        setState(411);
        caseBlock();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class CaseBlockContext extends ParserRuleContext {
    public TerminalNode OpenBrace() {
      return getToken(JavaScriptParser.OpenBrace, 0);
    }

    public TerminalNode CloseBrace() {
      return getToken(JavaScriptParser.CloseBrace, 0);
    }

    public List<CaseClausesContext> caseClauses() {
      return getRuleContexts(CaseClausesContext.class);
    }

    public CaseClausesContext caseClauses(int i) {
      return getRuleContext(CaseClausesContext.class, i);
    }

    public DefaultClauseContext defaultClause() {
      return getRuleContext(DefaultClauseContext.class, 0);
    }

    public CaseBlockContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_caseBlock;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterCaseBlock(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitCaseBlock(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitCaseBlock(this);
      else return visitor.visitChildren(this);
    }
  }

  public final CaseBlockContext caseBlock() throws RecognitionException {
    CaseBlockContext _localctx = new CaseBlockContext(_ctx, getState());
    enterRule(_localctx, 58, RULE_caseBlock);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(413);
        match(OpenBrace);
        setState(415);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Case) {
          {
            setState(414);
            caseClauses();
          }
        }

        setState(421);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Default) {
          {
            setState(417);
            defaultClause();
            setState(419);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == Case) {
              {
                setState(418);
                caseClauses();
              }
            }
          }
        }

        setState(423);
        match(CloseBrace);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class CaseClausesContext extends ParserRuleContext {
    public List<CaseClauseContext> caseClause() {
      return getRuleContexts(CaseClauseContext.class);
    }

    public CaseClauseContext caseClause(int i) {
      return getRuleContext(CaseClauseContext.class, i);
    }

    public CaseClausesContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_caseClauses;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterCaseClauses(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitCaseClauses(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitCaseClauses(this);
      else return visitor.visitChildren(this);
    }
  }

  public final CaseClausesContext caseClauses() throws RecognitionException {
    CaseClausesContext _localctx = new CaseClausesContext(_ctx, getState());
    enterRule(_localctx, 60, RULE_caseClauses);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(426);
        _errHandler.sync(this);
        _la = _input.LA(1);
        do {
          {
            {
              setState(425);
              caseClause();
            }
          }
          setState(428);
          _errHandler.sync(this);
          _la = _input.LA(1);
        } while (_la == Case);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class CaseClauseContext extends ParserRuleContext {
    public TerminalNode Case() {
      return getToken(JavaScriptParser.Case, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode Colon() {
      return getToken(JavaScriptParser.Colon, 0);
    }

    public StatementListContext statementList() {
      return getRuleContext(StatementListContext.class, 0);
    }

    public CaseClauseContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_caseClause;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterCaseClause(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitCaseClause(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitCaseClause(this);
      else return visitor.visitChildren(this);
    }
  }

  public final CaseClauseContext caseClause() throws RecognitionException {
    CaseClauseContext _localctx = new CaseClauseContext(_ctx, getState());
    enterRule(_localctx, 62, RULE_caseClause);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(430);
        match(Case);
        setState(431);
        expressionSequence();
        setState(432);
        match(Colon);
        setState(434);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 37, _ctx)) {
          case 1:
            {
              setState(433);
              statementList();
            }
            break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class DefaultClauseContext extends ParserRuleContext {
    public TerminalNode Default() {
      return getToken(JavaScriptParser.Default, 0);
    }

    public TerminalNode Colon() {
      return getToken(JavaScriptParser.Colon, 0);
    }

    public StatementListContext statementList() {
      return getRuleContext(StatementListContext.class, 0);
    }

    public DefaultClauseContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_defaultClause;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterDefaultClause(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitDefaultClause(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitDefaultClause(this);
      else return visitor.visitChildren(this);
    }
  }

  public final DefaultClauseContext defaultClause() throws RecognitionException {
    DefaultClauseContext _localctx = new DefaultClauseContext(_ctx, getState());
    enterRule(_localctx, 64, RULE_defaultClause);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(436);
        match(Default);
        setState(437);
        match(Colon);
        setState(439);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 38, _ctx)) {
          case 1:
            {
              setState(438);
              statementList();
            }
            break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class LabelledStatementContext extends ParserRuleContext {
    public IdentifierContext identifier() {
      return getRuleContext(IdentifierContext.class, 0);
    }

    public TerminalNode Colon() {
      return getToken(JavaScriptParser.Colon, 0);
    }

    public StatementContext statement() {
      return getRuleContext(StatementContext.class, 0);
    }

    public LabelledStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_labelledStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterLabelledStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitLabelledStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitLabelledStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final LabelledStatementContext labelledStatement() throws RecognitionException {
    LabelledStatementContext _localctx = new LabelledStatementContext(_ctx, getState());
    enterRule(_localctx, 66, RULE_labelledStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(441);
        identifier();
        setState(442);
        match(Colon);
        setState(443);
        statement();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ThrowStatementContext extends ParserRuleContext {
    public TerminalNode Throw() {
      return getToken(JavaScriptParser.Throw, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public ThrowStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_throwStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterThrowStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitThrowStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitThrowStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ThrowStatementContext throwStatement() throws RecognitionException {
    ThrowStatementContext _localctx = new ThrowStatementContext(_ctx, getState());
    enterRule(_localctx, 68, RULE_throwStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(445);
        match(Throw);
        setState(446);
        if (!(this.notLineTerminator()))
          throw new FailedPredicateException(this, "this.notLineTerminator()");
        setState(447);
        expressionSequence();
        setState(448);
        eos();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class TryStatementContext extends ParserRuleContext {
    public TerminalNode Try() {
      return getToken(JavaScriptParser.Try, 0);
    }

    public BlockContext block() {
      return getRuleContext(BlockContext.class, 0);
    }

    public CatchProductionContext catchProduction() {
      return getRuleContext(CatchProductionContext.class, 0);
    }

    public FinallyProductionContext finallyProduction() {
      return getRuleContext(FinallyProductionContext.class, 0);
    }

    public TryStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_tryStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterTryStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitTryStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitTryStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final TryStatementContext tryStatement() throws RecognitionException {
    TryStatementContext _localctx = new TryStatementContext(_ctx, getState());
    enterRule(_localctx, 70, RULE_tryStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(450);
        match(Try);
        setState(451);
        block();
        setState(457);
        _errHandler.sync(this);
        switch (_input.LA(1)) {
          case Catch:
            {
              setState(452);
              catchProduction();
              setState(454);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 39, _ctx)) {
                case 1:
                  {
                    setState(453);
                    finallyProduction();
                  }
                  break;
              }
            }
            break;
          case Finally:
            {
              setState(456);
              finallyProduction();
            }
            break;
          default:
            throw new NoViableAltException(this);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class CatchProductionContext extends ParserRuleContext {
    public TerminalNode Catch() {
      return getToken(JavaScriptParser.Catch, 0);
    }

    public BlockContext block() {
      return getRuleContext(BlockContext.class, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public AssignableContext assignable() {
      return getRuleContext(AssignableContext.class, 0);
    }

    public CatchProductionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_catchProduction;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterCatchProduction(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitCatchProduction(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitCatchProduction(this);
      else return visitor.visitChildren(this);
    }
  }

  public final CatchProductionContext catchProduction() throws RecognitionException {
    CatchProductionContext _localctx = new CatchProductionContext(_ctx, getState());
    enterRule(_localctx, 72, RULE_catchProduction);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(459);
        match(Catch);
        setState(465);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == OpenParen) {
          {
            setState(460);
            match(OpenParen);
            setState(462);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == OpenBracket
                || _la == OpenBrace
                || (((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 2114049L) != 0) {
              {
                setState(461);
                assignable();
              }
            }

            setState(464);
            match(CloseParen);
          }
        }

        setState(467);
        block();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class FinallyProductionContext extends ParserRuleContext {
    public TerminalNode Finally() {
      return getToken(JavaScriptParser.Finally, 0);
    }

    public BlockContext block() {
      return getRuleContext(BlockContext.class, 0);
    }

    public FinallyProductionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_finallyProduction;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterFinallyProduction(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitFinallyProduction(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitFinallyProduction(this);
      else return visitor.visitChildren(this);
    }
  }

  public final FinallyProductionContext finallyProduction() throws RecognitionException {
    FinallyProductionContext _localctx = new FinallyProductionContext(_ctx, getState());
    enterRule(_localctx, 74, RULE_finallyProduction);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(469);
        match(Finally);
        setState(470);
        block();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class DebuggerStatementContext extends ParserRuleContext {
    public TerminalNode Debugger() {
      return getToken(JavaScriptParser.Debugger, 0);
    }

    public EosContext eos() {
      return getRuleContext(EosContext.class, 0);
    }

    public DebuggerStatementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_debuggerStatement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterDebuggerStatement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitDebuggerStatement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitDebuggerStatement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final DebuggerStatementContext debuggerStatement() throws RecognitionException {
    DebuggerStatementContext _localctx = new DebuggerStatementContext(_ctx, getState());
    enterRule(_localctx, 76, RULE_debuggerStatement);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(472);
        match(Debugger);
        setState(473);
        eos();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class FunctionDeclarationContext extends ParserRuleContext {
    public TerminalNode Function_() {
      return getToken(JavaScriptParser.Function_, 0);
    }

    public IdentifierContext identifier() {
      return getRuleContext(IdentifierContext.class, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public FunctionBodyContext functionBody() {
      return getRuleContext(FunctionBodyContext.class, 0);
    }

    public TerminalNode Async() {
      return getToken(JavaScriptParser.Async, 0);
    }

    public TerminalNode Multiply() {
      return getToken(JavaScriptParser.Multiply, 0);
    }

    public FormalParameterListContext formalParameterList() {
      return getRuleContext(FormalParameterListContext.class, 0);
    }

    public FunctionDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_functionDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterFunctionDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitFunctionDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitFunctionDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public final FunctionDeclarationContext functionDeclaration() throws RecognitionException {
    FunctionDeclarationContext _localctx = new FunctionDeclarationContext(_ctx, getState());
    enterRule(_localctx, 78, RULE_functionDeclaration);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(476);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Async) {
          {
            setState(475);
            match(Async);
          }
        }

        setState(478);
        match(Function_);
        setState(480);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Multiply) {
          {
            setState(479);
            match(Multiply);
          }
        }

        setState(482);
        identifier();
        setState(483);
        match(OpenParen);
        setState(485);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (((_la) & ~0x3f) == 0 && ((1L << _la) & 262688L) != 0
            || (((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 2114049L) != 0) {
          {
            setState(484);
            formalParameterList();
          }
        }

        setState(487);
        match(CloseParen);
        setState(488);
        functionBody();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ClassDeclarationContext extends ParserRuleContext {
    public TerminalNode Class() {
      return getToken(JavaScriptParser.Class, 0);
    }

    public IdentifierContext identifier() {
      return getRuleContext(IdentifierContext.class, 0);
    }

    public ClassTailContext classTail() {
      return getRuleContext(ClassTailContext.class, 0);
    }

    public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_classDeclaration;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterClassDeclaration(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitClassDeclaration(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitClassDeclaration(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ClassDeclarationContext classDeclaration() throws RecognitionException {
    ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
    enterRule(_localctx, 80, RULE_classDeclaration);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(490);
        match(Class);
        setState(491);
        identifier();
        setState(492);
        classTail();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ClassTailContext extends ParserRuleContext {
    public TerminalNode OpenBrace() {
      return getToken(JavaScriptParser.OpenBrace, 0);
    }

    public TerminalNode CloseBrace() {
      return getToken(JavaScriptParser.CloseBrace, 0);
    }

    public TerminalNode Extends() {
      return getToken(JavaScriptParser.Extends, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public List<ClassElementContext> classElement() {
      return getRuleContexts(ClassElementContext.class);
    }

    public ClassElementContext classElement(int i) {
      return getRuleContext(ClassElementContext.class, i);
    }

    public ClassTailContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_classTail;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterClassTail(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitClassTail(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitClassTail(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ClassTailContext classTail() throws RecognitionException {
    ClassTailContext _localctx = new ClassTailContext(_ctx, getState());
    enterRule(_localctx, 82, RULE_classTail);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(496);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Extends) {
          {
            setState(494);
            match(Extends);
            setState(495);
            singleExpression(0);
          }
        }

        setState(498);
        match(OpenBrace);
        setState(502);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 47, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(499);
                classElement();
              }
            }
          }
          setState(504);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 47, _ctx);
        }
        setState(505);
        match(CloseBrace);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ClassElementContext extends ParserRuleContext {
    public MethodDefinitionContext methodDefinition() {
      return getRuleContext(MethodDefinitionContext.class, 0);
    }

    public AssignableContext assignable() {
      return getRuleContext(AssignableContext.class, 0);
    }

    public TerminalNode Assign() {
      return getToken(JavaScriptParser.Assign, 0);
    }

    public ObjectLiteralContext objectLiteral() {
      return getRuleContext(ObjectLiteralContext.class, 0);
    }

    public TerminalNode SemiColon() {
      return getToken(JavaScriptParser.SemiColon, 0);
    }

    public List<TerminalNode> Static() {
      return getTokens(JavaScriptParser.Static);
    }

    public TerminalNode Static(int i) {
      return getToken(JavaScriptParser.Static, i);
    }

    public List<IdentifierContext> identifier() {
      return getRuleContexts(IdentifierContext.class);
    }

    public IdentifierContext identifier(int i) {
      return getRuleContext(IdentifierContext.class, i);
    }

    public List<TerminalNode> Async() {
      return getTokens(JavaScriptParser.Async);
    }

    public TerminalNode Async(int i) {
      return getToken(JavaScriptParser.Async, i);
    }

    public EmptyStatement_Context emptyStatement_() {
      return getRuleContext(EmptyStatement_Context.class, 0);
    }

    public PropertyNameContext propertyName() {
      return getRuleContext(PropertyNameContext.class, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode Hashtag() {
      return getToken(JavaScriptParser.Hashtag, 0);
    }

    public ClassElementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_classElement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterClassElement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitClassElement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitClassElement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ClassElementContext classElement() throws RecognitionException {
    ClassElementContext _localctx = new ClassElementContext(_ctx, getState());
    enterRule(_localctx, 84, RULE_classElement);
    int _la;
    try {
      int _alt;
      setState(532);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 52, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(513);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 49, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
              if (_alt == 1) {
                {
                  setState(511);
                  _errHandler.sync(this);
                  switch (getInterpreter().adaptivePredict(_input, 48, _ctx)) {
                    case 1:
                      {
                        setState(507);
                        match(Static);
                      }
                      break;
                    case 2:
                      {
                        setState(508);
                        if (!(this.n("static")))
                          throw new FailedPredicateException(this, "this.n(\"static\")");
                        setState(509);
                        identifier();
                      }
                      break;
                    case 3:
                      {
                        setState(510);
                        match(Async);
                      }
                      break;
                  }
                }
              }
              setState(515);
              _errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(_input, 49, _ctx);
            }
            setState(522);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 50, _ctx)) {
              case 1:
                {
                  setState(516);
                  methodDefinition();
                }
                break;
              case 2:
                {
                  setState(517);
                  assignable();
                  setState(518);
                  match(Assign);
                  setState(519);
                  objectLiteral();
                  setState(520);
                  match(SemiColon);
                }
                break;
            }
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(524);
            emptyStatement_();
          }
          break;
        case 3:
          enterOuterAlt(_localctx, 3);
          {
            setState(526);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == Hashtag) {
              {
                setState(525);
                match(Hashtag);
              }
            }

            setState(528);
            propertyName();
            setState(529);
            match(Assign);
            setState(530);
            singleExpression(0);
          }
          break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class MethodDefinitionContext extends ParserRuleContext {
    public PropertyNameContext propertyName() {
      return getRuleContext(PropertyNameContext.class, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public FunctionBodyContext functionBody() {
      return getRuleContext(FunctionBodyContext.class, 0);
    }

    public TerminalNode Multiply() {
      return getToken(JavaScriptParser.Multiply, 0);
    }

    public TerminalNode Hashtag() {
      return getToken(JavaScriptParser.Hashtag, 0);
    }

    public FormalParameterListContext formalParameterList() {
      return getRuleContext(FormalParameterListContext.class, 0);
    }

    public GetterContext getter() {
      return getRuleContext(GetterContext.class, 0);
    }

    public SetterContext setter() {
      return getRuleContext(SetterContext.class, 0);
    }

    public MethodDefinitionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_methodDefinition;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterMethodDefinition(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitMethodDefinition(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitMethodDefinition(this);
      else return visitor.visitChildren(this);
    }
  }

  public final MethodDefinitionContext methodDefinition() throws RecognitionException {
    MethodDefinitionContext _localctx = new MethodDefinitionContext(_ctx, getState());
    enterRule(_localctx, 86, RULE_methodDefinition);
    int _la;
    try {
      setState(573);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 61, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(535);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == Multiply) {
              {
                setState(534);
                match(Multiply);
              }
            }

            setState(538);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == Hashtag) {
              {
                setState(537);
                match(Hashtag);
              }
            }

            setState(540);
            propertyName();
            setState(541);
            match(OpenParen);
            setState(543);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (((_la) & ~0x3f) == 0 && ((1L << _la) & 262688L) != 0
                || (((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 2114049L) != 0) {
              {
                setState(542);
                formalParameterList();
              }
            }

            setState(545);
            match(CloseParen);
            setState(546);
            functionBody();
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(549);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 56, _ctx)) {
              case 1:
                {
                  setState(548);
                  match(Multiply);
                }
                break;
            }
            setState(552);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 57, _ctx)) {
              case 1:
                {
                  setState(551);
                  match(Hashtag);
                }
                break;
            }
            setState(554);
            getter();
            setState(555);
            match(OpenParen);
            setState(556);
            match(CloseParen);
            setState(557);
            functionBody();
          }
          break;
        case 3:
          enterOuterAlt(_localctx, 3);
          {
            setState(560);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 58, _ctx)) {
              case 1:
                {
                  setState(559);
                  match(Multiply);
                }
                break;
            }
            setState(563);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 59, _ctx)) {
              case 1:
                {
                  setState(562);
                  match(Hashtag);
                }
                break;
            }
            setState(565);
            setter();
            setState(566);
            match(OpenParen);
            setState(568);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (((_la) & ~0x3f) == 0 && ((1L << _la) & 262688L) != 0
                || (((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 2114049L) != 0) {
              {
                setState(567);
                formalParameterList();
              }
            }

            setState(570);
            match(CloseParen);
            setState(571);
            functionBody();
          }
          break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class FormalParameterListContext extends ParserRuleContext {
    public List<FormalParameterArgContext> formalParameterArg() {
      return getRuleContexts(FormalParameterArgContext.class);
    }

    public FormalParameterArgContext formalParameterArg(int i) {
      return getRuleContext(FormalParameterArgContext.class, i);
    }

    public List<TerminalNode> Comma() {
      return getTokens(JavaScriptParser.Comma);
    }

    public TerminalNode Comma(int i) {
      return getToken(JavaScriptParser.Comma, i);
    }

    public LastFormalParameterArgContext lastFormalParameterArg() {
      return getRuleContext(LastFormalParameterArgContext.class, 0);
    }

    public FormalParameterListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_formalParameterList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterFormalParameterList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitFormalParameterList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitFormalParameterList(this);
      else return visitor.visitChildren(this);
    }
  }

  public final FormalParameterListContext formalParameterList() throws RecognitionException {
    FormalParameterListContext _localctx = new FormalParameterListContext(_ctx, getState());
    enterRule(_localctx, 88, RULE_formalParameterList);
    int _la;
    try {
      int _alt;
      setState(588);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case OpenBracket:
        case OpenBrace:
        case As:
        case Async:
        case NonStrictLet:
        case Identifier:
          enterOuterAlt(_localctx, 1);
          {
            setState(575);
            formalParameterArg();
            setState(580);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 62, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
              if (_alt == 1) {
                {
                  {
                    setState(576);
                    match(Comma);
                    setState(577);
                    formalParameterArg();
                  }
                }
              }
              setState(582);
              _errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(_input, 62, _ctx);
            }
            setState(585);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == Comma) {
              {
                setState(583);
                match(Comma);
                setState(584);
                lastFormalParameterArg();
              }
            }
          }
          break;
        case Ellipsis:
          enterOuterAlt(_localctx, 2);
          {
            setState(587);
            lastFormalParameterArg();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class FormalParameterArgContext extends ParserRuleContext {
    public AssignableContext assignable() {
      return getRuleContext(AssignableContext.class, 0);
    }

    public TerminalNode Assign() {
      return getToken(JavaScriptParser.Assign, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public FormalParameterArgContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_formalParameterArg;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterFormalParameterArg(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitFormalParameterArg(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitFormalParameterArg(this);
      else return visitor.visitChildren(this);
    }
  }

  public final FormalParameterArgContext formalParameterArg() throws RecognitionException {
    FormalParameterArgContext _localctx = new FormalParameterArgContext(_ctx, getState());
    enterRule(_localctx, 90, RULE_formalParameterArg);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(590);
        assignable();
        setState(593);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Assign) {
          {
            setState(591);
            match(Assign);
            setState(592);
            singleExpression(0);
          }
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class LastFormalParameterArgContext extends ParserRuleContext {
    public TerminalNode Ellipsis() {
      return getToken(JavaScriptParser.Ellipsis, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public LastFormalParameterArgContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_lastFormalParameterArg;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterLastFormalParameterArg(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitLastFormalParameterArg(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitLastFormalParameterArg(this);
      else return visitor.visitChildren(this);
    }
  }

  public final LastFormalParameterArgContext lastFormalParameterArg() throws RecognitionException {
    LastFormalParameterArgContext _localctx = new LastFormalParameterArgContext(_ctx, getState());
    enterRule(_localctx, 92, RULE_lastFormalParameterArg);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(595);
        match(Ellipsis);
        setState(596);
        singleExpression(0);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class FunctionBodyContext extends ParserRuleContext {
    public TerminalNode OpenBrace() {
      return getToken(JavaScriptParser.OpenBrace, 0);
    }

    public TerminalNode CloseBrace() {
      return getToken(JavaScriptParser.CloseBrace, 0);
    }

    public SourceElementsContext sourceElements() {
      return getRuleContext(SourceElementsContext.class, 0);
    }

    public FunctionBodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_functionBody;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterFunctionBody(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitFunctionBody(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitFunctionBody(this);
      else return visitor.visitChildren(this);
    }
  }

  public final FunctionBodyContext functionBody() throws RecognitionException {
    FunctionBodyContext _localctx = new FunctionBodyContext(_ctx, getState());
    enterRule(_localctx, 94, RULE_functionBody);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(598);
        match(OpenBrace);
        setState(600);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 66, _ctx)) {
          case 1:
            {
              setState(599);
              sourceElements();
            }
            break;
        }
        setState(602);
        match(CloseBrace);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class SourceElementsContext extends ParserRuleContext {
    public List<SourceElementContext> sourceElement() {
      return getRuleContexts(SourceElementContext.class);
    }

    public SourceElementContext sourceElement(int i) {
      return getRuleContext(SourceElementContext.class, i);
    }

    public SourceElementsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_sourceElements;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterSourceElements(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitSourceElements(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitSourceElements(this);
      else return visitor.visitChildren(this);
    }
  }

  public final SourceElementsContext sourceElements() throws RecognitionException {
    SourceElementsContext _localctx = new SourceElementsContext(_ctx, getState());
    enterRule(_localctx, 96, RULE_sourceElements);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(605);
        _errHandler.sync(this);
        _alt = 1;
        do {
          switch (_alt) {
            case 1:
              {
                {
                  setState(604);
                  sourceElement();
                }
              }
              break;
            default:
              throw new NoViableAltException(this);
          }
          setState(607);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 67, _ctx);
        } while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ArrayLiteralContext extends ParserRuleContext {
    public TerminalNode OpenBracket() {
      return getToken(JavaScriptParser.OpenBracket, 0);
    }

    public ElementListContext elementList() {
      return getRuleContext(ElementListContext.class, 0);
    }

    public TerminalNode CloseBracket() {
      return getToken(JavaScriptParser.CloseBracket, 0);
    }

    public ArrayLiteralContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_arrayLiteral;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterArrayLiteral(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitArrayLiteral(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitArrayLiteral(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ArrayLiteralContext arrayLiteral() throws RecognitionException {
    ArrayLiteralContext _localctx = new ArrayLiteralContext(_ctx, getState());
    enterRule(_localctx, 98, RULE_arrayLiteral);
    try {
      enterOuterAlt(_localctx, 1);
      {
        {
          setState(609);
          match(OpenBracket);
          setState(610);
          elementList();
          setState(611);
          match(CloseBracket);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ElementListContext extends ParserRuleContext {
    public List<TerminalNode> Comma() {
      return getTokens(JavaScriptParser.Comma);
    }

    public TerminalNode Comma(int i) {
      return getToken(JavaScriptParser.Comma, i);
    }

    public List<ArrayElementContext> arrayElement() {
      return getRuleContexts(ArrayElementContext.class);
    }

    public ArrayElementContext arrayElement(int i) {
      return getRuleContext(ArrayElementContext.class, i);
    }

    public ElementListContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_elementList;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterElementList(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitElementList(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitElementList(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ElementListContext elementList() throws RecognitionException {
    ElementListContext _localctx = new ElementListContext(_ctx, getState());
    enterRule(_localctx, 100, RULE_elementList);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(616);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 68, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(613);
                match(Comma);
              }
            }
          }
          setState(618);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 68, _ctx);
        }
        setState(620);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (((_la) & ~0x3f) == 0 && ((1L << _la) & -2305843009147370832L) != 0
            || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 252549662710974719L) != 0) {
          {
            setState(619);
            arrayElement();
          }
        }

        setState(630);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 71, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(623);
                _errHandler.sync(this);
                _la = _input.LA(1);
                do {
                  {
                    {
                      setState(622);
                      match(Comma);
                    }
                  }
                  setState(625);
                  _errHandler.sync(this);
                  _la = _input.LA(1);
                } while (_la == Comma);
                setState(627);
                arrayElement();
              }
            }
          }
          setState(632);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 71, _ctx);
        }
        setState(636);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == Comma) {
          {
            {
              setState(633);
              match(Comma);
            }
          }
          setState(638);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ArrayElementContext extends ParserRuleContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode Ellipsis() {
      return getToken(JavaScriptParser.Ellipsis, 0);
    }

    public ArrayElementContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_arrayElement;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterArrayElement(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitArrayElement(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitArrayElement(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ArrayElementContext arrayElement() throws RecognitionException {
    ArrayElementContext _localctx = new ArrayElementContext(_ctx, getState());
    enterRule(_localctx, 102, RULE_arrayElement);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(640);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Ellipsis) {
          {
            setState(639);
            match(Ellipsis);
          }
        }

        setState(642);
        singleExpression(0);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class PropertyAssignmentContext extends ParserRuleContext {
    public PropertyAssignmentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_propertyAssignment;
    }

    public PropertyAssignmentContext() {}

    public void copyFrom(PropertyAssignmentContext ctx) {
      super.copyFrom(ctx);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class PropertyExpressionAssignmentContext extends PropertyAssignmentContext {
    public PropertyNameContext propertyName() {
      return getRuleContext(PropertyNameContext.class, 0);
    }

    public TerminalNode Colon() {
      return getToken(JavaScriptParser.Colon, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public PropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPropertyExpressionAssignment(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPropertyExpressionAssignment(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor)
            .visitPropertyExpressionAssignment(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ComputedPropertyExpressionAssignmentContext
      extends PropertyAssignmentContext {
    public TerminalNode OpenBracket() {
      return getToken(JavaScriptParser.OpenBracket, 0);
    }

    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode CloseBracket() {
      return getToken(JavaScriptParser.CloseBracket, 0);
    }

    public TerminalNode Colon() {
      return getToken(JavaScriptParser.Colon, 0);
    }

    public ComputedPropertyExpressionAssignmentContext(PropertyAssignmentContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterComputedPropertyExpressionAssignment(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitComputedPropertyExpressionAssignment(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor)
            .visitComputedPropertyExpressionAssignment(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class PropertyShorthandContext extends PropertyAssignmentContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode Ellipsis() {
      return getToken(JavaScriptParser.Ellipsis, 0);
    }

    public PropertyShorthandContext(PropertyAssignmentContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPropertyShorthand(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPropertyShorthand(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitPropertyShorthand(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class PropertySetterContext extends PropertyAssignmentContext {
    public SetterContext setter() {
      return getRuleContext(SetterContext.class, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public FormalParameterArgContext formalParameterArg() {
      return getRuleContext(FormalParameterArgContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public FunctionBodyContext functionBody() {
      return getRuleContext(FunctionBodyContext.class, 0);
    }

    public PropertySetterContext(PropertyAssignmentContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPropertySetter(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPropertySetter(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitPropertySetter(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class PropertyGetterContext extends PropertyAssignmentContext {
    public GetterContext getter() {
      return getRuleContext(GetterContext.class, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public FunctionBodyContext functionBody() {
      return getRuleContext(FunctionBodyContext.class, 0);
    }

    public PropertyGetterContext(PropertyAssignmentContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPropertyGetter(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPropertyGetter(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitPropertyGetter(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class FunctionPropertyContext extends PropertyAssignmentContext {
    public PropertyNameContext propertyName() {
      return getRuleContext(PropertyNameContext.class, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public FunctionBodyContext functionBody() {
      return getRuleContext(FunctionBodyContext.class, 0);
    }

    public TerminalNode Async() {
      return getToken(JavaScriptParser.Async, 0);
    }

    public TerminalNode Multiply() {
      return getToken(JavaScriptParser.Multiply, 0);
    }

    public FormalParameterListContext formalParameterList() {
      return getRuleContext(FormalParameterListContext.class, 0);
    }

    public FunctionPropertyContext(PropertyAssignmentContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterFunctionProperty(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitFunctionProperty(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitFunctionProperty(this);
      else return visitor.visitChildren(this);
    }
  }

  public final PropertyAssignmentContext propertyAssignment() throws RecognitionException {
    PropertyAssignmentContext _localctx = new PropertyAssignmentContext(_ctx, getState());
    enterRule(_localctx, 104, RULE_propertyAssignment);
    int _la;
    try {
      setState(683);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 78, _ctx)) {
        case 1:
          _localctx = new PropertyExpressionAssignmentContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(644);
            propertyName();
            setState(645);
            match(Colon);
            setState(646);
            singleExpression(0);
          }
          break;
        case 2:
          _localctx = new ComputedPropertyExpressionAssignmentContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(648);
            match(OpenBracket);
            setState(649);
            singleExpression(0);
            setState(650);
            match(CloseBracket);
            setState(651);
            match(Colon);
            setState(652);
            singleExpression(0);
          }
          break;
        case 3:
          _localctx = new FunctionPropertyContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(655);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 74, _ctx)) {
              case 1:
                {
                  setState(654);
                  match(Async);
                }
                break;
            }
            setState(658);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == Multiply) {
              {
                setState(657);
                match(Multiply);
              }
            }

            setState(660);
            propertyName();
            setState(661);
            match(OpenParen);
            setState(663);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (((_la) & ~0x3f) == 0 && ((1L << _la) & 262688L) != 0
                || (((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 2114049L) != 0) {
              {
                setState(662);
                formalParameterList();
              }
            }

            setState(665);
            match(CloseParen);
            setState(666);
            functionBody();
          }
          break;
        case 4:
          _localctx = new PropertyGetterContext(_localctx);
          enterOuterAlt(_localctx, 4);
          {
            setState(668);
            getter();
            setState(669);
            match(OpenParen);
            setState(670);
            match(CloseParen);
            setState(671);
            functionBody();
          }
          break;
        case 5:
          _localctx = new PropertySetterContext(_localctx);
          enterOuterAlt(_localctx, 5);
          {
            setState(673);
            setter();
            setState(674);
            match(OpenParen);
            setState(675);
            formalParameterArg();
            setState(676);
            match(CloseParen);
            setState(677);
            functionBody();
          }
          break;
        case 6:
          _localctx = new PropertyShorthandContext(_localctx);
          enterOuterAlt(_localctx, 6);
          {
            setState(680);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == Ellipsis) {
              {
                setState(679);
                match(Ellipsis);
              }
            }

            setState(682);
            singleExpression(0);
          }
          break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class PropertyNameContext extends ParserRuleContext {
    public IdentifierNameContext identifierName() {
      return getRuleContext(IdentifierNameContext.class, 0);
    }

    public TerminalNode StringLiteral() {
      return getToken(JavaScriptParser.StringLiteral, 0);
    }

    public NumericLiteralContext numericLiteral() {
      return getRuleContext(NumericLiteralContext.class, 0);
    }

    public TerminalNode OpenBracket() {
      return getToken(JavaScriptParser.OpenBracket, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode CloseBracket() {
      return getToken(JavaScriptParser.CloseBracket, 0);
    }

    public PropertyNameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_propertyName;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPropertyName(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPropertyName(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitPropertyName(this);
      else return visitor.visitChildren(this);
    }
  }

  public final PropertyNameContext propertyName() throws RecognitionException {
    PropertyNameContext _localctx = new PropertyNameContext(_ctx, getState());
    enterRule(_localctx, 106, RULE_propertyName);
    try {
      setState(692);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case NullLiteral:
        case BooleanLiteral:
        case Break:
        case Do:
        case Instanceof:
        case Typeof:
        case Case:
        case Else:
        case New:
        case Var:
        case Catch:
        case Finally:
        case Return:
        case Void:
        case Continue:
        case For:
        case Switch:
        case While:
        case Debugger:
        case Function_:
        case This:
        case With:
        case Default:
        case If:
        case Throw:
        case Delete:
        case In:
        case Try:
        case As:
        case From:
        case Class:
        case Enum:
        case Extends:
        case Super:
        case Const:
        case Export:
        case Import:
        case Async:
        case Await:
        case Yield:
        case Implements:
        case StrictLet:
        case NonStrictLet:
        case Private:
        case Public:
        case Interface:
        case Package:
        case Protected:
        case Static:
        case Identifier:
          enterOuterAlt(_localctx, 1);
          {
            setState(685);
            identifierName();
          }
          break;
        case StringLiteral:
          enterOuterAlt(_localctx, 2);
          {
            setState(686);
            match(StringLiteral);
          }
          break;
        case DecimalLiteral:
        case HexIntegerLiteral:
        case OctalIntegerLiteral:
        case OctalIntegerLiteral2:
        case BinaryIntegerLiteral:
          enterOuterAlt(_localctx, 3);
          {
            setState(687);
            numericLiteral();
          }
          break;
        case OpenBracket:
          enterOuterAlt(_localctx, 4);
          {
            setState(688);
            match(OpenBracket);
            setState(689);
            singleExpression(0);
            setState(690);
            match(CloseBracket);
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ArgumentsContext extends ParserRuleContext {
    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public List<ArgumentContext> argument() {
      return getRuleContexts(ArgumentContext.class);
    }

    public ArgumentContext argument(int i) {
      return getRuleContext(ArgumentContext.class, i);
    }

    public List<TerminalNode> Comma() {
      return getTokens(JavaScriptParser.Comma);
    }

    public TerminalNode Comma(int i) {
      return getToken(JavaScriptParser.Comma, i);
    }

    public ArgumentsContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_arguments;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterArguments(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitArguments(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitArguments(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ArgumentsContext arguments() throws RecognitionException {
    ArgumentsContext _localctx = new ArgumentsContext(_ctx, getState());
    enterRule(_localctx, 108, RULE_arguments);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(694);
        match(OpenParen);
        setState(706);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (((_la) & ~0x3f) == 0 && ((1L << _la) & -2305843009147370832L) != 0
            || (((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & 252549662710974719L) != 0) {
          {
            setState(695);
            argument();
            setState(700);
            _errHandler.sync(this);
            _alt = getInterpreter().adaptivePredict(_input, 80, _ctx);
            while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
              if (_alt == 1) {
                {
                  {
                    setState(696);
                    match(Comma);
                    setState(697);
                    argument();
                  }
                }
              }
              setState(702);
              _errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(_input, 80, _ctx);
            }
            setState(704);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == Comma) {
              {
                setState(703);
                match(Comma);
              }
            }
          }
        }

        setState(708);
        match(CloseParen);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ArgumentContext extends ParserRuleContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public IdentifierContext identifier() {
      return getRuleContext(IdentifierContext.class, 0);
    }

    public TerminalNode Ellipsis() {
      return getToken(JavaScriptParser.Ellipsis, 0);
    }

    public ArgumentContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_argument;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterArgument(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitArgument(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitArgument(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ArgumentContext argument() throws RecognitionException {
    ArgumentContext _localctx = new ArgumentContext(_ctx, getState());
    enterRule(_localctx, 110, RULE_argument);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(711);
        _errHandler.sync(this);
        _la = _input.LA(1);
        if (_la == Ellipsis) {
          {
            setState(710);
            match(Ellipsis);
          }
        }

        setState(715);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 84, _ctx)) {
          case 1:
            {
              setState(713);
              singleExpression(0);
            }
            break;
          case 2:
            {
              setState(714);
              identifier();
            }
            break;
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ExpressionSequenceContext extends ParserRuleContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public List<TerminalNode> Comma() {
      return getTokens(JavaScriptParser.Comma);
    }

    public TerminalNode Comma(int i) {
      return getToken(JavaScriptParser.Comma, i);
    }

    public ExpressionSequenceContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_expressionSequence;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterExpressionSequence(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitExpressionSequence(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitExpressionSequence(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ExpressionSequenceContext expressionSequence() throws RecognitionException {
    ExpressionSequenceContext _localctx = new ExpressionSequenceContext(_ctx, getState());
    enterRule(_localctx, 112, RULE_expressionSequence);
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(717);
        singleExpression(0);
        setState(722);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 85, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            {
              {
                setState(718);
                match(Comma);
                setState(719);
                singleExpression(0);
              }
            }
          }
          setState(724);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 85, _ctx);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class SingleExpressionContext extends ParserRuleContext {
    public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_singleExpression;
    }

    public SingleExpressionContext() {}

    public void copyFrom(SingleExpressionContext ctx) {
      super.copyFrom(ctx);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class TemplateStringExpressionContext extends SingleExpressionContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TemplateStringLiteralContext templateStringLiteral() {
      return getRuleContext(TemplateStringLiteralContext.class, 0);
    }

    public TemplateStringExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterTemplateStringExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitTemplateStringExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitTemplateStringExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class TernaryExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode QuestionMark() {
      return getToken(JavaScriptParser.QuestionMark, 0);
    }

    public TerminalNode Colon() {
      return getToken(JavaScriptParser.Colon, 0);
    }

    public TernaryExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterTernaryExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitTernaryExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitTernaryExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class LogicalAndExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode And() {
      return getToken(JavaScriptParser.And, 0);
    }

    public LogicalAndExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterLogicalAndExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitLogicalAndExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitLogicalAndExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class PowerExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode Power() {
      return getToken(JavaScriptParser.Power, 0);
    }

    public PowerExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPowerExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPowerExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitPowerExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class PreIncrementExpressionContext extends SingleExpressionContext {
    public TerminalNode PlusPlus() {
      return getToken(JavaScriptParser.PlusPlus, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public PreIncrementExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPreIncrementExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPreIncrementExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitPreIncrementExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ObjectLiteralExpressionContext extends SingleExpressionContext {
    public ObjectLiteralContext objectLiteral() {
      return getRuleContext(ObjectLiteralContext.class, 0);
    }

    public ObjectLiteralExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterObjectLiteralExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitObjectLiteralExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitObjectLiteralExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class MetaExpressionContext extends SingleExpressionContext {
    public TerminalNode New() {
      return getToken(JavaScriptParser.New, 0);
    }

    public TerminalNode Dot() {
      return getToken(JavaScriptParser.Dot, 0);
    }

    public IdentifierContext identifier() {
      return getRuleContext(IdentifierContext.class, 0);
    }

    public MetaExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterMetaExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitMetaExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitMetaExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class InExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode In() {
      return getToken(JavaScriptParser.In, 0);
    }

    public InExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterInExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitInExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitInExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class LogicalOrExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode Or() {
      return getToken(JavaScriptParser.Or, 0);
    }

    public LogicalOrExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterLogicalOrExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitLogicalOrExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitLogicalOrExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class OptionalChainExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode QuestionMarkDot() {
      return getToken(JavaScriptParser.QuestionMarkDot, 0);
    }

    public OptionalChainExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterOptionalChainExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitOptionalChainExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitOptionalChainExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class NotExpressionContext extends SingleExpressionContext {
    public TerminalNode Not() {
      return getToken(JavaScriptParser.Not, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public NotExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterNotExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitNotExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitNotExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class PreDecreaseExpressionContext extends SingleExpressionContext {
    public TerminalNode MinusMinus() {
      return getToken(JavaScriptParser.MinusMinus, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public PreDecreaseExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPreDecreaseExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPreDecreaseExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitPreDecreaseExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ArgumentsExpressionContext extends SingleExpressionContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public ArgumentsContext arguments() {
      return getRuleContext(ArgumentsContext.class, 0);
    }

    public ArgumentsExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterArgumentsExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitArgumentsExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitArgumentsExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class AwaitExpressionContext extends SingleExpressionContext {
    public TerminalNode Await() {
      return getToken(JavaScriptParser.Await, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public AwaitExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterAwaitExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitAwaitExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitAwaitExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ThisExpressionContext extends SingleExpressionContext {
    public TerminalNode This() {
      return getToken(JavaScriptParser.This, 0);
    }

    public ThisExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterThisExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitThisExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitThisExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class FunctionExpressionContext extends SingleExpressionContext {
    public AnonymousFunctionContext anonymousFunction() {
      return getRuleContext(AnonymousFunctionContext.class, 0);
    }

    public FunctionExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterFunctionExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitFunctionExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitFunctionExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class UnaryMinusExpressionContext extends SingleExpressionContext {
    public TerminalNode Minus() {
      return getToken(JavaScriptParser.Minus, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public UnaryMinusExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterUnaryMinusExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitUnaryMinusExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitUnaryMinusExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class AssignmentExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode Assign() {
      return getToken(JavaScriptParser.Assign, 0);
    }

    public AssignmentExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterAssignmentExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitAssignmentExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitAssignmentExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class PostDecreaseExpressionContext extends SingleExpressionContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode MinusMinus() {
      return getToken(JavaScriptParser.MinusMinus, 0);
    }

    public PostDecreaseExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPostDecreaseExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPostDecreaseExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitPostDecreaseExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class TypeofExpressionContext extends SingleExpressionContext {
    public TerminalNode Typeof() {
      return getToken(JavaScriptParser.Typeof, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TypeofExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterTypeofExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitTypeofExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitTypeofExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class InstanceofExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode Instanceof() {
      return getToken(JavaScriptParser.Instanceof, 0);
    }

    public InstanceofExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterInstanceofExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitInstanceofExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitInstanceofExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class UnaryPlusExpressionContext extends SingleExpressionContext {
    public TerminalNode Plus() {
      return getToken(JavaScriptParser.Plus, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public UnaryPlusExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterUnaryPlusExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitUnaryPlusExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitUnaryPlusExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class DeleteExpressionContext extends SingleExpressionContext {
    public TerminalNode Delete() {
      return getToken(JavaScriptParser.Delete, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public DeleteExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterDeleteExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitDeleteExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitDeleteExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ImportExpressionContext extends SingleExpressionContext {
    public TerminalNode Import() {
      return getToken(JavaScriptParser.Import, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public ImportExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterImportExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitImportExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitImportExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class EqualityExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode Equals_() {
      return getToken(JavaScriptParser.Equals_, 0);
    }

    public TerminalNode NotEquals() {
      return getToken(JavaScriptParser.NotEquals, 0);
    }

    public TerminalNode IdentityEquals() {
      return getToken(JavaScriptParser.IdentityEquals, 0);
    }

    public TerminalNode IdentityNotEquals() {
      return getToken(JavaScriptParser.IdentityNotEquals, 0);
    }

    public EqualityExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterEqualityExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitEqualityExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitEqualityExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class BitXOrExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode BitXOr() {
      return getToken(JavaScriptParser.BitXOr, 0);
    }

    public BitXOrExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterBitXOrExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitBitXOrExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitBitXOrExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class SuperExpressionContext extends SingleExpressionContext {
    public TerminalNode Super() {
      return getToken(JavaScriptParser.Super, 0);
    }

    public SuperExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterSuperExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitSuperExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitSuperExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class MultiplicativeExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode Multiply() {
      return getToken(JavaScriptParser.Multiply, 0);
    }

    public TerminalNode Divide() {
      return getToken(JavaScriptParser.Divide, 0);
    }

    public TerminalNode Modulus() {
      return getToken(JavaScriptParser.Modulus, 0);
    }

    public MultiplicativeExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterMultiplicativeExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitMultiplicativeExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitMultiplicativeExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class BitShiftExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode LeftShiftArithmetic() {
      return getToken(JavaScriptParser.LeftShiftArithmetic, 0);
    }

    public TerminalNode RightShiftArithmetic() {
      return getToken(JavaScriptParser.RightShiftArithmetic, 0);
    }

    public TerminalNode RightShiftLogical() {
      return getToken(JavaScriptParser.RightShiftLogical, 0);
    }

    public BitShiftExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterBitShiftExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitBitShiftExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitBitShiftExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ParenthesizedExpressionContext extends SingleExpressionContext {
    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public ParenthesizedExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterParenthesizedExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitParenthesizedExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitParenthesizedExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class AdditiveExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode Plus() {
      return getToken(JavaScriptParser.Plus, 0);
    }

    public TerminalNode Minus() {
      return getToken(JavaScriptParser.Minus, 0);
    }

    public AdditiveExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterAdditiveExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitAdditiveExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitAdditiveExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class RelationalExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode LessThan() {
      return getToken(JavaScriptParser.LessThan, 0);
    }

    public TerminalNode MoreThan() {
      return getToken(JavaScriptParser.MoreThan, 0);
    }

    public TerminalNode LessThanEquals() {
      return getToken(JavaScriptParser.LessThanEquals, 0);
    }

    public TerminalNode GreaterThanEquals() {
      return getToken(JavaScriptParser.GreaterThanEquals, 0);
    }

    public RelationalExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterRelationalExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitRelationalExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitRelationalExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class PostIncrementExpressionContext extends SingleExpressionContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode PlusPlus() {
      return getToken(JavaScriptParser.PlusPlus, 0);
    }

    public PostIncrementExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterPostIncrementExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitPostIncrementExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitPostIncrementExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class YieldExpressionContext extends SingleExpressionContext {
    public YieldStatementContext yieldStatement() {
      return getRuleContext(YieldStatementContext.class, 0);
    }

    public YieldExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterYieldExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitYieldExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitYieldExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class BitNotExpressionContext extends SingleExpressionContext {
    public TerminalNode BitNot() {
      return getToken(JavaScriptParser.BitNot, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public BitNotExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterBitNotExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitBitNotExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitBitNotExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class NewExpressionContext extends SingleExpressionContext {
    public TerminalNode New() {
      return getToken(JavaScriptParser.New, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public ArgumentsContext arguments() {
      return getRuleContext(ArgumentsContext.class, 0);
    }

    public NewExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterNewExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitNewExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitNewExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class LiteralExpressionContext extends SingleExpressionContext {
    public LiteralContext literal() {
      return getRuleContext(LiteralContext.class, 0);
    }

    public LiteralExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterLiteralExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitLiteralExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitLiteralExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ArrayLiteralExpressionContext extends SingleExpressionContext {
    public ArrayLiteralContext arrayLiteral() {
      return getRuleContext(ArrayLiteralContext.class, 0);
    }

    public ArrayLiteralExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterArrayLiteralExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitArrayLiteralExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitArrayLiteralExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class MemberDotExpressionContext extends SingleExpressionContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode Dot() {
      return getToken(JavaScriptParser.Dot, 0);
    }

    public IdentifierNameContext identifierName() {
      return getRuleContext(IdentifierNameContext.class, 0);
    }

    public TerminalNode QuestionMark() {
      return getToken(JavaScriptParser.QuestionMark, 0);
    }

    public TerminalNode Hashtag() {
      return getToken(JavaScriptParser.Hashtag, 0);
    }

    public MemberDotExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterMemberDotExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitMemberDotExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitMemberDotExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ClassExpressionContext extends SingleExpressionContext {
    public TerminalNode Class() {
      return getToken(JavaScriptParser.Class, 0);
    }

    public ClassTailContext classTail() {
      return getRuleContext(ClassTailContext.class, 0);
    }

    public IdentifierContext identifier() {
      return getRuleContext(IdentifierContext.class, 0);
    }

    public ClassExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterClassExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitClassExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitClassExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class MemberIndexExpressionContext extends SingleExpressionContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode OpenBracket() {
      return getToken(JavaScriptParser.OpenBracket, 0);
    }

    public ExpressionSequenceContext expressionSequence() {
      return getRuleContext(ExpressionSequenceContext.class, 0);
    }

    public TerminalNode CloseBracket() {
      return getToken(JavaScriptParser.CloseBracket, 0);
    }

    public TerminalNode QuestionMarkDot() {
      return getToken(JavaScriptParser.QuestionMarkDot, 0);
    }

    public MemberIndexExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterMemberIndexExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitMemberIndexExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitMemberIndexExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class IdentifierExpressionContext extends SingleExpressionContext {
    public IdentifierContext identifier() {
      return getRuleContext(IdentifierContext.class, 0);
    }

    public IdentifierExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterIdentifierExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitIdentifierExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitIdentifierExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class BitAndExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode BitAnd() {
      return getToken(JavaScriptParser.BitAnd, 0);
    }

    public BitAndExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterBitAndExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitBitAndExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitBitAndExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class BitOrExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode BitOr() {
      return getToken(JavaScriptParser.BitOr, 0);
    }

    public BitOrExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterBitOrExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitBitOrExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitBitOrExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class AssignmentOperatorExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public AssignmentOperatorContext assignmentOperator() {
      return getRuleContext(AssignmentOperatorContext.class, 0);
    }

    public AssignmentOperatorExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterAssignmentOperatorExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitAssignmentOperatorExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor)
            .visitAssignmentOperatorExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class VoidExpressionContext extends SingleExpressionContext {
    public TerminalNode Void() {
      return getToken(JavaScriptParser.Void, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public VoidExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterVoidExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitVoidExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitVoidExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class CoalesceExpressionContext extends SingleExpressionContext {
    public List<SingleExpressionContext> singleExpression() {
      return getRuleContexts(SingleExpressionContext.class);
    }

    public SingleExpressionContext singleExpression(int i) {
      return getRuleContext(SingleExpressionContext.class, i);
    }

    public TerminalNode NullCoalesce() {
      return getToken(JavaScriptParser.NullCoalesce, 0);
    }

    public CoalesceExpressionContext(SingleExpressionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterCoalesceExpression(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitCoalesceExpression(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitCoalesceExpression(this);
      else return visitor.visitChildren(this);
    }
  }

  public final SingleExpressionContext singleExpression() throws RecognitionException {
    return singleExpression(0);
  }

  private SingleExpressionContext singleExpression(int _p) throws RecognitionException {
    ParserRuleContext _parentctx = _ctx;
    int _parentState = getState();
    SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, _parentState);
    SingleExpressionContext _prevctx = _localctx;
    int _startState = 114;
    enterRecursionRule(_localctx, 114, RULE_singleExpression, _p);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(777);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 87, _ctx)) {
          case 1:
            {
              _localctx = new FunctionExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;

              setState(726);
              anonymousFunction();
            }
            break;
          case 2:
            {
              _localctx = new ClassExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(727);
              match(Class);
              setState(729);
              _errHandler.sync(this);
              _la = _input.LA(1);
              if ((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 2114049L) != 0) {
                {
                  setState(728);
                  identifier();
                }
              }

              setState(731);
              classTail();
            }
            break;
          case 3:
            {
              _localctx = new NewExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(732);
              match(New);
              setState(733);
              singleExpression(0);
              setState(734);
              arguments();
            }
            break;
          case 4:
            {
              _localctx = new NewExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(736);
              match(New);
              setState(737);
              singleExpression(42);
            }
            break;
          case 5:
            {
              _localctx = new MetaExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(738);
              match(New);
              setState(739);
              match(Dot);
              setState(740);
              identifier();
            }
            break;
          case 6:
            {
              _localctx = new DeleteExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(741);
              match(Delete);
              setState(742);
              singleExpression(37);
            }
            break;
          case 7:
            {
              _localctx = new VoidExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(743);
              match(Void);
              setState(744);
              singleExpression(36);
            }
            break;
          case 8:
            {
              _localctx = new TypeofExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(745);
              match(Typeof);
              setState(746);
              singleExpression(35);
            }
            break;
          case 9:
            {
              _localctx = new PreIncrementExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(747);
              match(PlusPlus);
              setState(748);
              singleExpression(34);
            }
            break;
          case 10:
            {
              _localctx = new PreDecreaseExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(749);
              match(MinusMinus);
              setState(750);
              singleExpression(33);
            }
            break;
          case 11:
            {
              _localctx = new UnaryPlusExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(751);
              match(Plus);
              setState(752);
              singleExpression(32);
            }
            break;
          case 12:
            {
              _localctx = new UnaryMinusExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(753);
              match(Minus);
              setState(754);
              singleExpression(31);
            }
            break;
          case 13:
            {
              _localctx = new BitNotExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(755);
              match(BitNot);
              setState(756);
              singleExpression(30);
            }
            break;
          case 14:
            {
              _localctx = new NotExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(757);
              match(Not);
              setState(758);
              singleExpression(29);
            }
            break;
          case 15:
            {
              _localctx = new AwaitExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(759);
              match(Await);
              setState(760);
              singleExpression(28);
            }
            break;
          case 16:
            {
              _localctx = new ImportExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(761);
              match(Import);
              setState(762);
              match(OpenParen);
              setState(763);
              singleExpression(0);
              setState(764);
              match(CloseParen);
            }
            break;
          case 17:
            {
              _localctx = new YieldExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(766);
              yieldStatement();
            }
            break;
          case 18:
            {
              _localctx = new ThisExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(767);
              match(This);
            }
            break;
          case 19:
            {
              _localctx = new IdentifierExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(768);
              identifier();
            }
            break;
          case 20:
            {
              _localctx = new SuperExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(769);
              match(Super);
            }
            break;
          case 21:
            {
              _localctx = new LiteralExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(770);
              literal();
            }
            break;
          case 22:
            {
              _localctx = new ArrayLiteralExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(771);
              arrayLiteral();
            }
            break;
          case 23:
            {
              _localctx = new ObjectLiteralExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(772);
              objectLiteral();
            }
            break;
          case 24:
            {
              _localctx = new ParenthesizedExpressionContext(_localctx);
              _ctx = _localctx;
              _prevctx = _localctx;
              setState(773);
              match(OpenParen);
              setState(774);
              expressionSequence();
              setState(775);
              match(CloseParen);
            }
            break;
        }
        _ctx.stop = _input.LT(-1);
        setState(866);
        _errHandler.sync(this);
        _alt = getInterpreter().adaptivePredict(_input, 92, _ctx);
        while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
          if (_alt == 1) {
            if (_parseListeners != null) triggerExitRuleEvent();
            _prevctx = _localctx;
            {
              setState(864);
              _errHandler.sync(this);
              switch (getInterpreter().adaptivePredict(_input, 91, _ctx)) {
                case 1:
                  {
                    _localctx =
                        new OptionalChainExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(779);
                    if (!(precpred(_ctx, 46)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 46)");
                    setState(780);
                    match(QuestionMarkDot);
                    setState(781);
                    singleExpression(47);
                  }
                  break;
                case 2:
                  {
                    _localctx =
                        new PowerExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(782);
                    if (!(precpred(_ctx, 27)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 27)");
                    setState(783);
                    match(Power);
                    setState(784);
                    singleExpression(27);
                  }
                  break;
                case 3:
                  {
                    _localctx =
                        new MultiplicativeExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(785);
                    if (!(precpred(_ctx, 26)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 26)");
                    setState(786);
                    _la = _input.LA(1);
                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 469762048L) != 0)) {
                      _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(787);
                    singleExpression(27);
                  }
                  break;
                case 4:
                  {
                    _localctx =
                        new AdditiveExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(788);
                    if (!(precpred(_ctx, 25)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 25)");
                    setState(789);
                    _la = _input.LA(1);
                    if (!(_la == Plus || _la == Minus)) {
                      _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(790);
                    singleExpression(26);
                  }
                  break;
                case 5:
                  {
                    _localctx =
                        new CoalesceExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(791);
                    if (!(precpred(_ctx, 24)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 24)");
                    setState(792);
                    match(NullCoalesce);
                    setState(793);
                    singleExpression(25);
                  }
                  break;
                case 6:
                  {
                    _localctx =
                        new BitShiftExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(794);
                    if (!(precpred(_ctx, 23)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 23)");
                    setState(795);
                    _la = _input.LA(1);
                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 30064771072L) != 0)) {
                      _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(796);
                    singleExpression(24);
                  }
                  break;
                case 7:
                  {
                    _localctx =
                        new RelationalExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(797);
                    if (!(precpred(_ctx, 22)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 22)");
                    setState(798);
                    _la = _input.LA(1);
                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 515396075520L) != 0)) {
                      _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(799);
                    singleExpression(23);
                  }
                  break;
                case 8:
                  {
                    _localctx =
                        new InstanceofExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(800);
                    if (!(precpred(_ctx, 21)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 21)");
                    setState(801);
                    match(Instanceof);
                    setState(802);
                    singleExpression(22);
                  }
                  break;
                case 9:
                  {
                    _localctx =
                        new InExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(803);
                    if (!(precpred(_ctx, 20)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 20)");
                    setState(804);
                    match(In);
                    setState(805);
                    singleExpression(21);
                  }
                  break;
                case 10:
                  {
                    _localctx =
                        new EqualityExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(806);
                    if (!(precpred(_ctx, 19)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 19)");
                    setState(807);
                    _la = _input.LA(1);
                    if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 8246337208320L) != 0)) {
                      _errHandler.recoverInline(this);
                    } else {
                      if (_input.LA(1) == Token.EOF) matchedEOF = true;
                      _errHandler.reportMatch(this);
                      consume();
                    }
                    setState(808);
                    singleExpression(20);
                  }
                  break;
                case 11:
                  {
                    _localctx =
                        new BitAndExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(809);
                    if (!(precpred(_ctx, 18)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 18)");
                    setState(810);
                    match(BitAnd);
                    setState(811);
                    singleExpression(19);
                  }
                  break;
                case 12:
                  {
                    _localctx =
                        new BitXOrExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(812);
                    if (!(precpred(_ctx, 17)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 17)");
                    setState(813);
                    match(BitXOr);
                    setState(814);
                    singleExpression(18);
                  }
                  break;
                case 13:
                  {
                    _localctx =
                        new BitOrExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(815);
                    if (!(precpred(_ctx, 16)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 16)");
                    setState(816);
                    match(BitOr);
                    setState(817);
                    singleExpression(17);
                  }
                  break;
                case 14:
                  {
                    _localctx =
                        new LogicalAndExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(818);
                    if (!(precpred(_ctx, 15)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 15)");
                    setState(819);
                    match(And);
                    setState(820);
                    singleExpression(16);
                  }
                  break;
                case 15:
                  {
                    _localctx =
                        new LogicalOrExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(821);
                    if (!(precpred(_ctx, 14)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 14)");
                    setState(822);
                    match(Or);
                    setState(823);
                    singleExpression(15);
                  }
                  break;
                case 16:
                  {
                    _localctx =
                        new TernaryExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(824);
                    if (!(precpred(_ctx, 13)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 13)");
                    setState(825);
                    match(QuestionMark);
                    setState(826);
                    singleExpression(0);
                    setState(827);
                    match(Colon);
                    setState(828);
                    singleExpression(14);
                  }
                  break;
                case 17:
                  {
                    _localctx =
                        new AssignmentExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(830);
                    if (!(precpred(_ctx, 12)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 12)");
                    setState(831);
                    match(Assign);
                    setState(832);
                    singleExpression(12);
                  }
                  break;
                case 18:
                  {
                    _localctx =
                        new AssignmentOperatorExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(833);
                    if (!(precpred(_ctx, 11)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 11)");
                    setState(834);
                    assignmentOperator();
                    setState(835);
                    singleExpression(11);
                  }
                  break;
                case 19:
                  {
                    _localctx =
                        new MemberIndexExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(837);
                    if (!(precpred(_ctx, 45)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 45)");
                    setState(839);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == QuestionMarkDot) {
                      {
                        setState(838);
                        match(QuestionMarkDot);
                      }
                    }

                    setState(841);
                    match(OpenBracket);
                    setState(842);
                    expressionSequence();
                    setState(843);
                    match(CloseBracket);
                  }
                  break;
                case 20:
                  {
                    _localctx =
                        new MemberDotExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(845);
                    if (!(precpred(_ctx, 44)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 44)");
                    setState(847);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == QuestionMark) {
                      {
                        setState(846);
                        match(QuestionMark);
                      }
                    }

                    setState(849);
                    match(Dot);
                    setState(851);
                    _errHandler.sync(this);
                    _la = _input.LA(1);
                    if (_la == Hashtag) {
                      {
                        setState(850);
                        match(Hashtag);
                      }
                    }

                    setState(853);
                    identifierName();
                  }
                  break;
                case 21:
                  {
                    _localctx =
                        new ArgumentsExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(854);
                    if (!(precpred(_ctx, 41)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 41)");
                    setState(855);
                    arguments();
                  }
                  break;
                case 22:
                  {
                    _localctx =
                        new PostIncrementExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(856);
                    if (!(precpred(_ctx, 39)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 39)");
                    setState(857);
                    if (!(this.notLineTerminator()))
                      throw new FailedPredicateException(this, "this.notLineTerminator()");
                    setState(858);
                    match(PlusPlus);
                  }
                  break;
                case 23:
                  {
                    _localctx =
                        new PostDecreaseExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(859);
                    if (!(precpred(_ctx, 38)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 38)");
                    setState(860);
                    if (!(this.notLineTerminator()))
                      throw new FailedPredicateException(this, "this.notLineTerminator()");
                    setState(861);
                    match(MinusMinus);
                  }
                  break;
                case 24:
                  {
                    _localctx =
                        new TemplateStringExpressionContext(
                            new SingleExpressionContext(_parentctx, _parentState));
                    pushNewRecursionContext(_localctx, _startState, RULE_singleExpression);
                    setState(862);
                    if (!(precpred(_ctx, 9)))
                      throw new FailedPredicateException(this, "precpred(_ctx, 9)");
                    setState(863);
                    templateStringLiteral();
                  }
                  break;
              }
            }
          }
          setState(868);
          _errHandler.sync(this);
          _alt = getInterpreter().adaptivePredict(_input, 92, _ctx);
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      unrollRecursionContexts(_parentctx);
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class AssignableContext extends ParserRuleContext {
    public IdentifierContext identifier() {
      return getRuleContext(IdentifierContext.class, 0);
    }

    public ArrayLiteralContext arrayLiteral() {
      return getRuleContext(ArrayLiteralContext.class, 0);
    }

    public ObjectLiteralContext objectLiteral() {
      return getRuleContext(ObjectLiteralContext.class, 0);
    }

    public AssignableContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_assignable;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterAssignable(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitAssignable(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitAssignable(this);
      else return visitor.visitChildren(this);
    }
  }

  public final AssignableContext assignable() throws RecognitionException {
    AssignableContext _localctx = new AssignableContext(_ctx, getState());
    enterRule(_localctx, 116, RULE_assignable);
    try {
      setState(872);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case As:
        case Async:
        case NonStrictLet:
        case Identifier:
          enterOuterAlt(_localctx, 1);
          {
            setState(869);
            identifier();
          }
          break;
        case OpenBracket:
          enterOuterAlt(_localctx, 2);
          {
            setState(870);
            arrayLiteral();
          }
          break;
        case OpenBrace:
          enterOuterAlt(_localctx, 3);
          {
            setState(871);
            objectLiteral();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ObjectLiteralContext extends ParserRuleContext {
    public TerminalNode OpenBrace() {
      return getToken(JavaScriptParser.OpenBrace, 0);
    }

    public TerminalNode CloseBrace() {
      return getToken(JavaScriptParser.CloseBrace, 0);
    }

    public List<PropertyAssignmentContext> propertyAssignment() {
      return getRuleContexts(PropertyAssignmentContext.class);
    }

    public PropertyAssignmentContext propertyAssignment(int i) {
      return getRuleContext(PropertyAssignmentContext.class, i);
    }

    public List<TerminalNode> Comma() {
      return getTokens(JavaScriptParser.Comma);
    }

    public TerminalNode Comma(int i) {
      return getToken(JavaScriptParser.Comma, i);
    }

    public ObjectLiteralContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_objectLiteral;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterObjectLiteral(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitObjectLiteral(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitObjectLiteral(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ObjectLiteralContext objectLiteral() throws RecognitionException {
    ObjectLiteralContext _localctx = new ObjectLiteralContext(_ctx, getState());
    enterRule(_localctx, 118, RULE_objectLiteral);
    int _la;
    try {
      int _alt;
      enterOuterAlt(_localctx, 1);
      {
        setState(874);
        match(OpenBrace);
        setState(886);
        _errHandler.sync(this);
        switch (getInterpreter().adaptivePredict(_input, 96, _ctx)) {
          case 1:
            {
              setState(875);
              propertyAssignment();
              setState(880);
              _errHandler.sync(this);
              _alt = getInterpreter().adaptivePredict(_input, 94, _ctx);
              while (_alt != 2 && _alt != org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER) {
                if (_alt == 1) {
                  {
                    {
                      setState(876);
                      match(Comma);
                      setState(877);
                      propertyAssignment();
                    }
                  }
                }
                setState(882);
                _errHandler.sync(this);
                _alt = getInterpreter().adaptivePredict(_input, 94, _ctx);
              }
              setState(884);
              _errHandler.sync(this);
              _la = _input.LA(1);
              if (_la == Comma) {
                {
                  setState(883);
                  match(Comma);
                }
              }
            }
            break;
        }
        setState(888);
        match(CloseBrace);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class AnonymousFunctionContext extends ParserRuleContext {
    public AnonymousFunctionContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_anonymousFunction;
    }

    public AnonymousFunctionContext() {}

    public void copyFrom(AnonymousFunctionContext ctx) {
      super.copyFrom(ctx);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class AnonymousFunctionDeclContext extends AnonymousFunctionContext {
    public TerminalNode Function_() {
      return getToken(JavaScriptParser.Function_, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public FunctionBodyContext functionBody() {
      return getRuleContext(FunctionBodyContext.class, 0);
    }

    public TerminalNode Async() {
      return getToken(JavaScriptParser.Async, 0);
    }

    public TerminalNode Multiply() {
      return getToken(JavaScriptParser.Multiply, 0);
    }

    public FormalParameterListContext formalParameterList() {
      return getRuleContext(FormalParameterListContext.class, 0);
    }

    public AnonymousFunctionDeclContext(AnonymousFunctionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterAnonymousFunctionDecl(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitAnonymousFunctionDecl(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitAnonymousFunctionDecl(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ArrowFunctionContext extends AnonymousFunctionContext {
    public ArrowFunctionParametersContext arrowFunctionParameters() {
      return getRuleContext(ArrowFunctionParametersContext.class, 0);
    }

    public TerminalNode ARROW() {
      return getToken(JavaScriptParser.ARROW, 0);
    }

    public ArrowFunctionBodyContext arrowFunctionBody() {
      return getRuleContext(ArrowFunctionBodyContext.class, 0);
    }

    public TerminalNode Async() {
      return getToken(JavaScriptParser.Async, 0);
    }

    public ArrowFunctionContext(AnonymousFunctionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterArrowFunction(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitArrowFunction(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitArrowFunction(this);
      else return visitor.visitChildren(this);
    }
  }

  @SuppressWarnings("CheckReturnValue")
  public static class FunctionDeclContext extends AnonymousFunctionContext {
    public FunctionDeclarationContext functionDeclaration() {
      return getRuleContext(FunctionDeclarationContext.class, 0);
    }

    public FunctionDeclContext(AnonymousFunctionContext ctx) {
      copyFrom(ctx);
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterFunctionDecl(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitFunctionDecl(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitFunctionDecl(this);
      else return visitor.visitChildren(this);
    }
  }

  public final AnonymousFunctionContext anonymousFunction() throws RecognitionException {
    AnonymousFunctionContext _localctx = new AnonymousFunctionContext(_ctx, getState());
    enterRule(_localctx, 120, RULE_anonymousFunction);
    int _la;
    try {
      setState(911);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 101, _ctx)) {
        case 1:
          _localctx = new FunctionDeclContext(_localctx);
          enterOuterAlt(_localctx, 1);
          {
            setState(890);
            functionDeclaration();
          }
          break;
        case 2:
          _localctx = new AnonymousFunctionDeclContext(_localctx);
          enterOuterAlt(_localctx, 2);
          {
            setState(892);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == Async) {
              {
                setState(891);
                match(Async);
              }
            }

            setState(894);
            match(Function_);
            setState(896);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (_la == Multiply) {
              {
                setState(895);
                match(Multiply);
              }
            }

            setState(898);
            match(OpenParen);
            setState(900);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (((_la) & ~0x3f) == 0 && ((1L << _la) & 262688L) != 0
                || (((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 2114049L) != 0) {
              {
                setState(899);
                formalParameterList();
              }
            }

            setState(902);
            match(CloseParen);
            setState(903);
            functionBody();
          }
          break;
        case 3:
          _localctx = new ArrowFunctionContext(_localctx);
          enterOuterAlt(_localctx, 3);
          {
            setState(905);
            _errHandler.sync(this);
            switch (getInterpreter().adaptivePredict(_input, 100, _ctx)) {
              case 1:
                {
                  setState(904);
                  match(Async);
                }
                break;
            }
            setState(907);
            arrowFunctionParameters();
            setState(908);
            match(ARROW);
            setState(909);
            arrowFunctionBody();
          }
          break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ArrowFunctionParametersContext extends ParserRuleContext {
    public IdentifierContext identifier() {
      return getRuleContext(IdentifierContext.class, 0);
    }

    public TerminalNode OpenParen() {
      return getToken(JavaScriptParser.OpenParen, 0);
    }

    public TerminalNode CloseParen() {
      return getToken(JavaScriptParser.CloseParen, 0);
    }

    public FormalParameterListContext formalParameterList() {
      return getRuleContext(FormalParameterListContext.class, 0);
    }

    public ArrowFunctionParametersContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_arrowFunctionParameters;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterArrowFunctionParameters(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitArrowFunctionParameters(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitArrowFunctionParameters(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ArrowFunctionParametersContext arrowFunctionParameters()
      throws RecognitionException {
    ArrowFunctionParametersContext _localctx = new ArrowFunctionParametersContext(_ctx, getState());
    enterRule(_localctx, 122, RULE_arrowFunctionParameters);
    int _la;
    try {
      setState(919);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case As:
        case Async:
        case NonStrictLet:
        case Identifier:
          enterOuterAlt(_localctx, 1);
          {
            setState(913);
            identifier();
          }
          break;
        case OpenParen:
          enterOuterAlt(_localctx, 2);
          {
            setState(914);
            match(OpenParen);
            setState(916);
            _errHandler.sync(this);
            _la = _input.LA(1);
            if (((_la) & ~0x3f) == 0 && ((1L << _la) & 262688L) != 0
                || (((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 2114049L) != 0) {
              {
                setState(915);
                formalParameterList();
              }
            }

            setState(918);
            match(CloseParen);
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ArrowFunctionBodyContext extends ParserRuleContext {
    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public FunctionBodyContext functionBody() {
      return getRuleContext(FunctionBodyContext.class, 0);
    }

    public ArrowFunctionBodyContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_arrowFunctionBody;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterArrowFunctionBody(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitArrowFunctionBody(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitArrowFunctionBody(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ArrowFunctionBodyContext arrowFunctionBody() throws RecognitionException {
    ArrowFunctionBodyContext _localctx = new ArrowFunctionBodyContext(_ctx, getState());
    enterRule(_localctx, 124, RULE_arrowFunctionBody);
    try {
      setState(923);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 104, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(921);
            singleExpression(0);
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(922);
            functionBody();
          }
          break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class AssignmentOperatorContext extends ParserRuleContext {
    public TerminalNode MultiplyAssign() {
      return getToken(JavaScriptParser.MultiplyAssign, 0);
    }

    public TerminalNode DivideAssign() {
      return getToken(JavaScriptParser.DivideAssign, 0);
    }

    public TerminalNode ModulusAssign() {
      return getToken(JavaScriptParser.ModulusAssign, 0);
    }

    public TerminalNode PlusAssign() {
      return getToken(JavaScriptParser.PlusAssign, 0);
    }

    public TerminalNode MinusAssign() {
      return getToken(JavaScriptParser.MinusAssign, 0);
    }

    public TerminalNode LeftShiftArithmeticAssign() {
      return getToken(JavaScriptParser.LeftShiftArithmeticAssign, 0);
    }

    public TerminalNode RightShiftArithmeticAssign() {
      return getToken(JavaScriptParser.RightShiftArithmeticAssign, 0);
    }

    public TerminalNode RightShiftLogicalAssign() {
      return getToken(JavaScriptParser.RightShiftLogicalAssign, 0);
    }

    public TerminalNode BitAndAssign() {
      return getToken(JavaScriptParser.BitAndAssign, 0);
    }

    public TerminalNode BitXorAssign() {
      return getToken(JavaScriptParser.BitXorAssign, 0);
    }

    public TerminalNode BitOrAssign() {
      return getToken(JavaScriptParser.BitOrAssign, 0);
    }

    public TerminalNode PowerAssign() {
      return getToken(JavaScriptParser.PowerAssign, 0);
    }

    public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_assignmentOperator;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterAssignmentOperator(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitAssignmentOperator(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitAssignmentOperator(this);
      else return visitor.visitChildren(this);
    }
  }

  public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
    AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
    enterRule(_localctx, 126, RULE_assignmentOperator);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(925);
        _la = _input.LA(1);
        if (!(((_la) & ~0x3f) == 0 && ((1L << _la) & 1152640029630136320L) != 0)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class LiteralContext extends ParserRuleContext {
    public TerminalNode NullLiteral() {
      return getToken(JavaScriptParser.NullLiteral, 0);
    }

    public TerminalNode BooleanLiteral() {
      return getToken(JavaScriptParser.BooleanLiteral, 0);
    }

    public TerminalNode StringLiteral() {
      return getToken(JavaScriptParser.StringLiteral, 0);
    }

    public TemplateStringLiteralContext templateStringLiteral() {
      return getRuleContext(TemplateStringLiteralContext.class, 0);
    }

    public TerminalNode RegularExpressionLiteral() {
      return getToken(JavaScriptParser.RegularExpressionLiteral, 0);
    }

    public NumericLiteralContext numericLiteral() {
      return getRuleContext(NumericLiteralContext.class, 0);
    }

    public BigintLiteralContext bigintLiteral() {
      return getRuleContext(BigintLiteralContext.class, 0);
    }

    public LiteralContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_literal;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterLiteral(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitLiteral(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitLiteral(this);
      else return visitor.visitChildren(this);
    }
  }

  public final LiteralContext literal() throws RecognitionException {
    LiteralContext _localctx = new LiteralContext(_ctx, getState());
    enterRule(_localctx, 128, RULE_literal);
    try {
      setState(934);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case NullLiteral:
          enterOuterAlt(_localctx, 1);
          {
            setState(927);
            match(NullLiteral);
          }
          break;
        case BooleanLiteral:
          enterOuterAlt(_localctx, 2);
          {
            setState(928);
            match(BooleanLiteral);
          }
          break;
        case StringLiteral:
          enterOuterAlt(_localctx, 3);
          {
            setState(929);
            match(StringLiteral);
          }
          break;
        case BackTick:
          enterOuterAlt(_localctx, 4);
          {
            setState(930);
            templateStringLiteral();
          }
          break;
        case RegularExpressionLiteral:
          enterOuterAlt(_localctx, 5);
          {
            setState(931);
            match(RegularExpressionLiteral);
          }
          break;
        case DecimalLiteral:
        case HexIntegerLiteral:
        case OctalIntegerLiteral:
        case OctalIntegerLiteral2:
        case BinaryIntegerLiteral:
          enterOuterAlt(_localctx, 6);
          {
            setState(932);
            numericLiteral();
          }
          break;
        case BigHexIntegerLiteral:
        case BigOctalIntegerLiteral:
        case BigBinaryIntegerLiteral:
        case BigDecimalIntegerLiteral:
          enterOuterAlt(_localctx, 7);
          {
            setState(933);
            bigintLiteral();
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class TemplateStringLiteralContext extends ParserRuleContext {
    public List<TerminalNode> BackTick() {
      return getTokens(JavaScriptParser.BackTick);
    }

    public TerminalNode BackTick(int i) {
      return getToken(JavaScriptParser.BackTick, i);
    }

    public List<TemplateStringAtomContext> templateStringAtom() {
      return getRuleContexts(TemplateStringAtomContext.class);
    }

    public TemplateStringAtomContext templateStringAtom(int i) {
      return getRuleContext(TemplateStringAtomContext.class, i);
    }

    public TemplateStringLiteralContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_templateStringLiteral;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterTemplateStringLiteral(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitTemplateStringLiteral(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitTemplateStringLiteral(this);
      else return visitor.visitChildren(this);
    }
  }

  public final TemplateStringLiteralContext templateStringLiteral() throws RecognitionException {
    TemplateStringLiteralContext _localctx = new TemplateStringLiteralContext(_ctx, getState());
    enterRule(_localctx, 130, RULE_templateStringLiteral);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(936);
        match(BackTick);
        setState(940);
        _errHandler.sync(this);
        _la = _input.LA(1);
        while (_la == TemplateStringStartExpression || _la == TemplateStringAtom) {
          {
            {
              setState(937);
              templateStringAtom();
            }
          }
          setState(942);
          _errHandler.sync(this);
          _la = _input.LA(1);
        }
        setState(943);
        match(BackTick);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class TemplateStringAtomContext extends ParserRuleContext {
    public TerminalNode TemplateStringAtom() {
      return getToken(JavaScriptParser.TemplateStringAtom, 0);
    }

    public TerminalNode TemplateStringStartExpression() {
      return getToken(JavaScriptParser.TemplateStringStartExpression, 0);
    }

    public SingleExpressionContext singleExpression() {
      return getRuleContext(SingleExpressionContext.class, 0);
    }

    public TerminalNode TemplateCloseBrace() {
      return getToken(JavaScriptParser.TemplateCloseBrace, 0);
    }

    public TemplateStringAtomContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_templateStringAtom;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterTemplateStringAtom(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitTemplateStringAtom(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitTemplateStringAtom(this);
      else return visitor.visitChildren(this);
    }
  }

  public final TemplateStringAtomContext templateStringAtom() throws RecognitionException {
    TemplateStringAtomContext _localctx = new TemplateStringAtomContext(_ctx, getState());
    enterRule(_localctx, 132, RULE_templateStringAtom);
    try {
      setState(950);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case TemplateStringAtom:
          enterOuterAlt(_localctx, 1);
          {
            setState(945);
            match(TemplateStringAtom);
          }
          break;
        case TemplateStringStartExpression:
          enterOuterAlt(_localctx, 2);
          {
            setState(946);
            match(TemplateStringStartExpression);
            setState(947);
            singleExpression(0);
            setState(948);
            match(TemplateCloseBrace);
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class NumericLiteralContext extends ParserRuleContext {
    public TerminalNode DecimalLiteral() {
      return getToken(JavaScriptParser.DecimalLiteral, 0);
    }

    public TerminalNode HexIntegerLiteral() {
      return getToken(JavaScriptParser.HexIntegerLiteral, 0);
    }

    public TerminalNode OctalIntegerLiteral() {
      return getToken(JavaScriptParser.OctalIntegerLiteral, 0);
    }

    public TerminalNode OctalIntegerLiteral2() {
      return getToken(JavaScriptParser.OctalIntegerLiteral2, 0);
    }

    public TerminalNode BinaryIntegerLiteral() {
      return getToken(JavaScriptParser.BinaryIntegerLiteral, 0);
    }

    public NumericLiteralContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_numericLiteral;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterNumericLiteral(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitNumericLiteral(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitNumericLiteral(this);
      else return visitor.visitChildren(this);
    }
  }

  public final NumericLiteralContext numericLiteral() throws RecognitionException {
    NumericLiteralContext _localctx = new NumericLiteralContext(_ctx, getState());
    enterRule(_localctx, 134, RULE_numericLiteral);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(952);
        _la = _input.LA(1);
        if (!((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 31L) != 0)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class BigintLiteralContext extends ParserRuleContext {
    public TerminalNode BigDecimalIntegerLiteral() {
      return getToken(JavaScriptParser.BigDecimalIntegerLiteral, 0);
    }

    public TerminalNode BigHexIntegerLiteral() {
      return getToken(JavaScriptParser.BigHexIntegerLiteral, 0);
    }

    public TerminalNode BigOctalIntegerLiteral() {
      return getToken(JavaScriptParser.BigOctalIntegerLiteral, 0);
    }

    public TerminalNode BigBinaryIntegerLiteral() {
      return getToken(JavaScriptParser.BigBinaryIntegerLiteral, 0);
    }

    public BigintLiteralContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_bigintLiteral;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterBigintLiteral(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitBigintLiteral(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitBigintLiteral(this);
      else return visitor.visitChildren(this);
    }
  }

  public final BigintLiteralContext bigintLiteral() throws RecognitionException {
    BigintLiteralContext _localctx = new BigintLiteralContext(_ctx, getState());
    enterRule(_localctx, 136, RULE_bigintLiteral);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(954);
        _la = _input.LA(1);
        if (!((((_la - 68)) & ~0x3f) == 0 && ((1L << (_la - 68)) & 15L) != 0)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class GetterContext extends ParserRuleContext {
    public IdentifierContext identifier() {
      return getRuleContext(IdentifierContext.class, 0);
    }

    public PropertyNameContext propertyName() {
      return getRuleContext(PropertyNameContext.class, 0);
    }

    public GetterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_getter;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterGetter(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitGetter(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitGetter(this);
      else return visitor.visitChildren(this);
    }
  }

  public final GetterContext getter() throws RecognitionException {
    GetterContext _localctx = new GetterContext(_ctx, getState());
    enterRule(_localctx, 138, RULE_getter);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(956);
        if (!(this.n("get"))) throw new FailedPredicateException(this, "this.n(\"get\")");
        setState(957);
        identifier();
        setState(958);
        propertyName();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class SetterContext extends ParserRuleContext {
    public IdentifierContext identifier() {
      return getRuleContext(IdentifierContext.class, 0);
    }

    public PropertyNameContext propertyName() {
      return getRuleContext(PropertyNameContext.class, 0);
    }

    public SetterContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_setter;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterSetter(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitSetter(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitSetter(this);
      else return visitor.visitChildren(this);
    }
  }

  public final SetterContext setter() throws RecognitionException {
    SetterContext _localctx = new SetterContext(_ctx, getState());
    enterRule(_localctx, 140, RULE_setter);
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(960);
        if (!(this.n("set"))) throw new FailedPredicateException(this, "this.n(\"set\")");
        setState(961);
        identifier();
        setState(962);
        propertyName();
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class IdentifierNameContext extends ParserRuleContext {
    public IdentifierContext identifier() {
      return getRuleContext(IdentifierContext.class, 0);
    }

    public ReservedWordContext reservedWord() {
      return getRuleContext(ReservedWordContext.class, 0);
    }

    public IdentifierNameContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_identifierName;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterIdentifierName(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitIdentifierName(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitIdentifierName(this);
      else return visitor.visitChildren(this);
    }
  }

  public final IdentifierNameContext identifierName() throws RecognitionException {
    IdentifierNameContext _localctx = new IdentifierNameContext(_ctx, getState());
    enterRule(_localctx, 142, RULE_identifierName);
    try {
      setState(966);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 108, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(964);
            identifier();
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(965);
            reservedWord();
          }
          break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class IdentifierContext extends ParserRuleContext {
    public TerminalNode Identifier() {
      return getToken(JavaScriptParser.Identifier, 0);
    }

    public TerminalNode NonStrictLet() {
      return getToken(JavaScriptParser.NonStrictLet, 0);
    }

    public TerminalNode Async() {
      return getToken(JavaScriptParser.Async, 0);
    }

    public TerminalNode As() {
      return getToken(JavaScriptParser.As, 0);
    }

    public IdentifierContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_identifier;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterIdentifier(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitIdentifier(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitIdentifier(this);
      else return visitor.visitChildren(this);
    }
  }

  public final IdentifierContext identifier() throws RecognitionException {
    IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
    enterRule(_localctx, 144, RULE_identifier);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(968);
        _la = _input.LA(1);
        if (!((((_la - 98)) & ~0x3f) == 0 && ((1L << (_la - 98)) & 2114049L) != 0)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class ReservedWordContext extends ParserRuleContext {
    public KeywordContext keyword() {
      return getRuleContext(KeywordContext.class, 0);
    }

    public TerminalNode NullLiteral() {
      return getToken(JavaScriptParser.NullLiteral, 0);
    }

    public TerminalNode BooleanLiteral() {
      return getToken(JavaScriptParser.BooleanLiteral, 0);
    }

    public ReservedWordContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_reservedWord;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterReservedWord(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitReservedWord(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitReservedWord(this);
      else return visitor.visitChildren(this);
    }
  }

  public final ReservedWordContext reservedWord() throws RecognitionException {
    ReservedWordContext _localctx = new ReservedWordContext(_ctx, getState());
    enterRule(_localctx, 146, RULE_reservedWord);
    try {
      setState(973);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case Break:
        case Do:
        case Instanceof:
        case Typeof:
        case Case:
        case Else:
        case New:
        case Var:
        case Catch:
        case Finally:
        case Return:
        case Void:
        case Continue:
        case For:
        case Switch:
        case While:
        case Debugger:
        case Function_:
        case This:
        case With:
        case Default:
        case If:
        case Throw:
        case Delete:
        case In:
        case Try:
        case As:
        case From:
        case Class:
        case Enum:
        case Extends:
        case Super:
        case Const:
        case Export:
        case Import:
        case Async:
        case Await:
        case Yield:
        case Implements:
        case StrictLet:
        case NonStrictLet:
        case Private:
        case Public:
        case Interface:
        case Package:
        case Protected:
        case Static:
          enterOuterAlt(_localctx, 1);
          {
            setState(970);
            keyword();
          }
          break;
        case NullLiteral:
          enterOuterAlt(_localctx, 2);
          {
            setState(971);
            match(NullLiteral);
          }
          break;
        case BooleanLiteral:
          enterOuterAlt(_localctx, 3);
          {
            setState(972);
            match(BooleanLiteral);
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class KeywordContext extends ParserRuleContext {
    public TerminalNode Break() {
      return getToken(JavaScriptParser.Break, 0);
    }

    public TerminalNode Do() {
      return getToken(JavaScriptParser.Do, 0);
    }

    public TerminalNode Instanceof() {
      return getToken(JavaScriptParser.Instanceof, 0);
    }

    public TerminalNode Typeof() {
      return getToken(JavaScriptParser.Typeof, 0);
    }

    public TerminalNode Case() {
      return getToken(JavaScriptParser.Case, 0);
    }

    public TerminalNode Else() {
      return getToken(JavaScriptParser.Else, 0);
    }

    public TerminalNode New() {
      return getToken(JavaScriptParser.New, 0);
    }

    public TerminalNode Var() {
      return getToken(JavaScriptParser.Var, 0);
    }

    public TerminalNode Catch() {
      return getToken(JavaScriptParser.Catch, 0);
    }

    public TerminalNode Finally() {
      return getToken(JavaScriptParser.Finally, 0);
    }

    public TerminalNode Return() {
      return getToken(JavaScriptParser.Return, 0);
    }

    public TerminalNode Void() {
      return getToken(JavaScriptParser.Void, 0);
    }

    public TerminalNode Continue() {
      return getToken(JavaScriptParser.Continue, 0);
    }

    public TerminalNode For() {
      return getToken(JavaScriptParser.For, 0);
    }

    public TerminalNode Switch() {
      return getToken(JavaScriptParser.Switch, 0);
    }

    public TerminalNode While() {
      return getToken(JavaScriptParser.While, 0);
    }

    public TerminalNode Debugger() {
      return getToken(JavaScriptParser.Debugger, 0);
    }

    public TerminalNode Function_() {
      return getToken(JavaScriptParser.Function_, 0);
    }

    public TerminalNode This() {
      return getToken(JavaScriptParser.This, 0);
    }

    public TerminalNode With() {
      return getToken(JavaScriptParser.With, 0);
    }

    public TerminalNode Default() {
      return getToken(JavaScriptParser.Default, 0);
    }

    public TerminalNode If() {
      return getToken(JavaScriptParser.If, 0);
    }

    public TerminalNode Throw() {
      return getToken(JavaScriptParser.Throw, 0);
    }

    public TerminalNode Delete() {
      return getToken(JavaScriptParser.Delete, 0);
    }

    public TerminalNode In() {
      return getToken(JavaScriptParser.In, 0);
    }

    public TerminalNode Try() {
      return getToken(JavaScriptParser.Try, 0);
    }

    public TerminalNode Class() {
      return getToken(JavaScriptParser.Class, 0);
    }

    public TerminalNode Enum() {
      return getToken(JavaScriptParser.Enum, 0);
    }

    public TerminalNode Extends() {
      return getToken(JavaScriptParser.Extends, 0);
    }

    public TerminalNode Super() {
      return getToken(JavaScriptParser.Super, 0);
    }

    public TerminalNode Const() {
      return getToken(JavaScriptParser.Const, 0);
    }

    public TerminalNode Export() {
      return getToken(JavaScriptParser.Export, 0);
    }

    public TerminalNode Import() {
      return getToken(JavaScriptParser.Import, 0);
    }

    public TerminalNode Implements() {
      return getToken(JavaScriptParser.Implements, 0);
    }

    public Let_Context let_() {
      return getRuleContext(Let_Context.class, 0);
    }

    public TerminalNode Private() {
      return getToken(JavaScriptParser.Private, 0);
    }

    public TerminalNode Public() {
      return getToken(JavaScriptParser.Public, 0);
    }

    public TerminalNode Interface() {
      return getToken(JavaScriptParser.Interface, 0);
    }

    public TerminalNode Package() {
      return getToken(JavaScriptParser.Package, 0);
    }

    public TerminalNode Protected() {
      return getToken(JavaScriptParser.Protected, 0);
    }

    public TerminalNode Static() {
      return getToken(JavaScriptParser.Static, 0);
    }

    public TerminalNode Yield() {
      return getToken(JavaScriptParser.Yield, 0);
    }

    public TerminalNode Async() {
      return getToken(JavaScriptParser.Async, 0);
    }

    public TerminalNode Await() {
      return getToken(JavaScriptParser.Await, 0);
    }

    public TerminalNode From() {
      return getToken(JavaScriptParser.From, 0);
    }

    public TerminalNode As() {
      return getToken(JavaScriptParser.As, 0);
    }

    public KeywordContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_keyword;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterKeyword(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitKeyword(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitKeyword(this);
      else return visitor.visitChildren(this);
    }
  }

  public final KeywordContext keyword() throws RecognitionException {
    KeywordContext _localctx = new KeywordContext(_ctx, getState());
    enterRule(_localctx, 148, RULE_keyword);
    try {
      setState(1021);
      _errHandler.sync(this);
      switch (_input.LA(1)) {
        case Break:
          enterOuterAlt(_localctx, 1);
          {
            setState(975);
            match(Break);
          }
          break;
        case Do:
          enterOuterAlt(_localctx, 2);
          {
            setState(976);
            match(Do);
          }
          break;
        case Instanceof:
          enterOuterAlt(_localctx, 3);
          {
            setState(977);
            match(Instanceof);
          }
          break;
        case Typeof:
          enterOuterAlt(_localctx, 4);
          {
            setState(978);
            match(Typeof);
          }
          break;
        case Case:
          enterOuterAlt(_localctx, 5);
          {
            setState(979);
            match(Case);
          }
          break;
        case Else:
          enterOuterAlt(_localctx, 6);
          {
            setState(980);
            match(Else);
          }
          break;
        case New:
          enterOuterAlt(_localctx, 7);
          {
            setState(981);
            match(New);
          }
          break;
        case Var:
          enterOuterAlt(_localctx, 8);
          {
            setState(982);
            match(Var);
          }
          break;
        case Catch:
          enterOuterAlt(_localctx, 9);
          {
            setState(983);
            match(Catch);
          }
          break;
        case Finally:
          enterOuterAlt(_localctx, 10);
          {
            setState(984);
            match(Finally);
          }
          break;
        case Return:
          enterOuterAlt(_localctx, 11);
          {
            setState(985);
            match(Return);
          }
          break;
        case Void:
          enterOuterAlt(_localctx, 12);
          {
            setState(986);
            match(Void);
          }
          break;
        case Continue:
          enterOuterAlt(_localctx, 13);
          {
            setState(987);
            match(Continue);
          }
          break;
        case For:
          enterOuterAlt(_localctx, 14);
          {
            setState(988);
            match(For);
          }
          break;
        case Switch:
          enterOuterAlt(_localctx, 15);
          {
            setState(989);
            match(Switch);
          }
          break;
        case While:
          enterOuterAlt(_localctx, 16);
          {
            setState(990);
            match(While);
          }
          break;
        case Debugger:
          enterOuterAlt(_localctx, 17);
          {
            setState(991);
            match(Debugger);
          }
          break;
        case Function_:
          enterOuterAlt(_localctx, 18);
          {
            setState(992);
            match(Function_);
          }
          break;
        case This:
          enterOuterAlt(_localctx, 19);
          {
            setState(993);
            match(This);
          }
          break;
        case With:
          enterOuterAlt(_localctx, 20);
          {
            setState(994);
            match(With);
          }
          break;
        case Default:
          enterOuterAlt(_localctx, 21);
          {
            setState(995);
            match(Default);
          }
          break;
        case If:
          enterOuterAlt(_localctx, 22);
          {
            setState(996);
            match(If);
          }
          break;
        case Throw:
          enterOuterAlt(_localctx, 23);
          {
            setState(997);
            match(Throw);
          }
          break;
        case Delete:
          enterOuterAlt(_localctx, 24);
          {
            setState(998);
            match(Delete);
          }
          break;
        case In:
          enterOuterAlt(_localctx, 25);
          {
            setState(999);
            match(In);
          }
          break;
        case Try:
          enterOuterAlt(_localctx, 26);
          {
            setState(1000);
            match(Try);
          }
          break;
        case Class:
          enterOuterAlt(_localctx, 27);
          {
            setState(1001);
            match(Class);
          }
          break;
        case Enum:
          enterOuterAlt(_localctx, 28);
          {
            setState(1002);
            match(Enum);
          }
          break;
        case Extends:
          enterOuterAlt(_localctx, 29);
          {
            setState(1003);
            match(Extends);
          }
          break;
        case Super:
          enterOuterAlt(_localctx, 30);
          {
            setState(1004);
            match(Super);
          }
          break;
        case Const:
          enterOuterAlt(_localctx, 31);
          {
            setState(1005);
            match(Const);
          }
          break;
        case Export:
          enterOuterAlt(_localctx, 32);
          {
            setState(1006);
            match(Export);
          }
          break;
        case Import:
          enterOuterAlt(_localctx, 33);
          {
            setState(1007);
            match(Import);
          }
          break;
        case Implements:
          enterOuterAlt(_localctx, 34);
          {
            setState(1008);
            match(Implements);
          }
          break;
        case StrictLet:
        case NonStrictLet:
          enterOuterAlt(_localctx, 35);
          {
            setState(1009);
            let_();
          }
          break;
        case Private:
          enterOuterAlt(_localctx, 36);
          {
            setState(1010);
            match(Private);
          }
          break;
        case Public:
          enterOuterAlt(_localctx, 37);
          {
            setState(1011);
            match(Public);
          }
          break;
        case Interface:
          enterOuterAlt(_localctx, 38);
          {
            setState(1012);
            match(Interface);
          }
          break;
        case Package:
          enterOuterAlt(_localctx, 39);
          {
            setState(1013);
            match(Package);
          }
          break;
        case Protected:
          enterOuterAlt(_localctx, 40);
          {
            setState(1014);
            match(Protected);
          }
          break;
        case Static:
          enterOuterAlt(_localctx, 41);
          {
            setState(1015);
            match(Static);
          }
          break;
        case Yield:
          enterOuterAlt(_localctx, 42);
          {
            setState(1016);
            match(Yield);
          }
          break;
        case Async:
          enterOuterAlt(_localctx, 43);
          {
            setState(1017);
            match(Async);
          }
          break;
        case Await:
          enterOuterAlt(_localctx, 44);
          {
            setState(1018);
            match(Await);
          }
          break;
        case From:
          enterOuterAlt(_localctx, 45);
          {
            setState(1019);
            match(From);
          }
          break;
        case As:
          enterOuterAlt(_localctx, 46);
          {
            setState(1020);
            match(As);
          }
          break;
        default:
          throw new NoViableAltException(this);
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class Let_Context extends ParserRuleContext {
    public TerminalNode NonStrictLet() {
      return getToken(JavaScriptParser.NonStrictLet, 0);
    }

    public TerminalNode StrictLet() {
      return getToken(JavaScriptParser.StrictLet, 0);
    }

    public Let_Context(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_let_;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterLet_(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitLet_(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitLet_(this);
      else return visitor.visitChildren(this);
    }
  }

  public final Let_Context let_() throws RecognitionException {
    Let_Context _localctx = new Let_Context(_ctx, getState());
    enterRule(_localctx, 150, RULE_let_);
    int _la;
    try {
      enterOuterAlt(_localctx, 1);
      {
        setState(1023);
        _la = _input.LA(1);
        if (!(_la == StrictLet || _la == NonStrictLet)) {
          _errHandler.recoverInline(this);
        } else {
          if (_input.LA(1) == Token.EOF) matchedEOF = true;
          _errHandler.reportMatch(this);
          consume();
        }
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  @SuppressWarnings("CheckReturnValue")
  public static class EosContext extends ParserRuleContext {
    public TerminalNode SemiColon() {
      return getToken(JavaScriptParser.SemiColon, 0);
    }

    public TerminalNode EOF() {
      return getToken(JavaScriptParser.EOF, 0);
    }

    public EosContext(ParserRuleContext parent, int invokingState) {
      super(parent, invokingState);
    }

    @Override
    public int getRuleIndex() {
      return RULE_eos;
    }

    @Override
    public void enterRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).enterEos(this);
    }

    @Override
    public void exitRule(ParseTreeListener listener) {
      if (listener instanceof JavaScriptParserListener)
        ((JavaScriptParserListener) listener).exitEos(this);
    }

    @Override
    public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
      if (visitor instanceof JavaScriptParserVisitor)
        return ((JavaScriptParserVisitor<? extends T>) visitor).visitEos(this);
      else return visitor.visitChildren(this);
    }
  }

  public final EosContext eos() throws RecognitionException {
    EosContext _localctx = new EosContext(_ctx, getState());
    enterRule(_localctx, 152, RULE_eos);
    try {
      setState(1029);
      _errHandler.sync(this);
      switch (getInterpreter().adaptivePredict(_input, 111, _ctx)) {
        case 1:
          enterOuterAlt(_localctx, 1);
          {
            setState(1025);
            match(SemiColon);
          }
          break;
        case 2:
          enterOuterAlt(_localctx, 2);
          {
            setState(1026);
            match(EOF);
          }
          break;
        case 3:
          enterOuterAlt(_localctx, 3);
          {
            setState(1027);
            if (!(this.lineTerminatorAhead()))
              throw new FailedPredicateException(this, "this.lineTerminatorAhead()");
          }
          break;
        case 4:
          enterOuterAlt(_localctx, 4);
          {
            setState(1028);
            if (!(this.closeBrace())) throw new FailedPredicateException(this, "this.closeBrace()");
          }
          break;
      }
    } catch (RecognitionException re) {
      _localctx.exception = re;
      _errHandler.reportError(this, re);
      _errHandler.recover(this, re);
    } finally {
      exitRule();
    }
    return _localctx;
  }

  public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
    switch (ruleIndex) {
      case 19:
        return expressionStatement_sempred((ExpressionStatementContext) _localctx, predIndex);
      case 21:
        return iterationStatement_sempred((IterationStatementContext) _localctx, predIndex);
      case 23:
        return continueStatement_sempred((ContinueStatementContext) _localctx, predIndex);
      case 24:
        return breakStatement_sempred((BreakStatementContext) _localctx, predIndex);
      case 25:
        return returnStatement_sempred((ReturnStatementContext) _localctx, predIndex);
      case 26:
        return yieldStatement_sempred((YieldStatementContext) _localctx, predIndex);
      case 34:
        return throwStatement_sempred((ThrowStatementContext) _localctx, predIndex);
      case 42:
        return classElement_sempred((ClassElementContext) _localctx, predIndex);
      case 57:
        return singleExpression_sempred((SingleExpressionContext) _localctx, predIndex);
      case 69:
        return getter_sempred((GetterContext) _localctx, predIndex);
      case 70:
        return setter_sempred((SetterContext) _localctx, predIndex);
      case 76:
        return eos_sempred((EosContext) _localctx, predIndex);
    }
    return true;
  }

  private boolean expressionStatement_sempred(ExpressionStatementContext _localctx, int predIndex) {
    switch (predIndex) {
      case 0:
        return this.notOpenBraceAndNotFunction();
    }
    return true;
  }

  private boolean iterationStatement_sempred(IterationStatementContext _localctx, int predIndex) {
    switch (predIndex) {
      case 1:
        return this.p("of");
    }
    return true;
  }

  private boolean continueStatement_sempred(ContinueStatementContext _localctx, int predIndex) {
    switch (predIndex) {
      case 2:
        return this.notLineTerminator();
    }
    return true;
  }

  private boolean breakStatement_sempred(BreakStatementContext _localctx, int predIndex) {
    switch (predIndex) {
      case 3:
        return this.notLineTerminator();
    }
    return true;
  }

  private boolean returnStatement_sempred(ReturnStatementContext _localctx, int predIndex) {
    switch (predIndex) {
      case 4:
        return this.notLineTerminator();
    }
    return true;
  }

  private boolean yieldStatement_sempred(YieldStatementContext _localctx, int predIndex) {
    switch (predIndex) {
      case 5:
        return this.notLineTerminator();
    }
    return true;
  }

  private boolean throwStatement_sempred(ThrowStatementContext _localctx, int predIndex) {
    switch (predIndex) {
      case 6:
        return this.notLineTerminator();
    }
    return true;
  }

  private boolean classElement_sempred(ClassElementContext _localctx, int predIndex) {
    switch (predIndex) {
      case 7:
        return this.n("static");
    }
    return true;
  }

  private boolean singleExpression_sempred(SingleExpressionContext _localctx, int predIndex) {
    switch (predIndex) {
      case 8:
        return precpred(_ctx, 46);
      case 9:
        return precpred(_ctx, 27);
      case 10:
        return precpred(_ctx, 26);
      case 11:
        return precpred(_ctx, 25);
      case 12:
        return precpred(_ctx, 24);
      case 13:
        return precpred(_ctx, 23);
      case 14:
        return precpred(_ctx, 22);
      case 15:
        return precpred(_ctx, 21);
      case 16:
        return precpred(_ctx, 20);
      case 17:
        return precpred(_ctx, 19);
      case 18:
        return precpred(_ctx, 18);
      case 19:
        return precpred(_ctx, 17);
      case 20:
        return precpred(_ctx, 16);
      case 21:
        return precpred(_ctx, 15);
      case 22:
        return precpred(_ctx, 14);
      case 23:
        return precpred(_ctx, 13);
      case 24:
        return precpred(_ctx, 12);
      case 25:
        return precpred(_ctx, 11);
      case 26:
        return precpred(_ctx, 45);
      case 27:
        return precpred(_ctx, 44);
      case 28:
        return precpred(_ctx, 41);
      case 29:
        return precpred(_ctx, 39);
      case 30:
        return this.notLineTerminator();
      case 31:
        return precpred(_ctx, 38);
      case 32:
        return this.notLineTerminator();
      case 33:
        return precpred(_ctx, 9);
    }
    return true;
  }

  private boolean getter_sempred(GetterContext _localctx, int predIndex) {
    switch (predIndex) {
      case 34:
        return this.n("get");
    }
    return true;
  }

  private boolean setter_sempred(SetterContext _localctx, int predIndex) {
    switch (predIndex) {
      case 35:
        return this.n("set");
    }
    return true;
  }

  private boolean eos_sempred(EosContext _localctx, int predIndex) {
    switch (predIndex) {
      case 36:
        return this.lineTerminatorAhead();
      case 37:
        return this.closeBrace();
    }
    return true;
  }

  public static final String _serializedATN =
      "\u0004\u0001\u0080\u0408\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"
          + "\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"
          + "\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"
          + "\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"
          + "\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"
          + "\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"
          + "\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"
          + "\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"
          + "\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"
          + "\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"
          + "\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"
          + "\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"
          + "\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"
          + ",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"
          + "1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"
          + "6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"
          + ";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"
          + "@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"
          + "E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"
          + "J\u0002K\u0007K\u0002L\u0007L\u0001\u0000\u0003\u0000\u009c\b\u0000\u0001"
          + "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001"
          + "\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"
          + "\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"
          + "\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"
          + "\u0002\u00b6\b\u0002\u0001\u0003\u0001\u0003\u0003\u0003\u00ba\b\u0003"
          + "\u0001\u0003\u0001\u0003\u0001\u0004\u0004\u0004\u00bf\b\u0004\u000b\u0004"
          + "\f\u0004\u00c0\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0006\u0003\u0006"
          + "\u00c7\b\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00cb\b\u0006\u0001"
          + "\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0003\u0006\u00d2"
          + "\b\u0006\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0005\u0007\u00d8"
          + "\b\u0007\n\u0007\f\u0007\u00db\t\u0007\u0001\u0007\u0001\u0007\u0003\u0007"
          + "\u00df\b\u0007\u0003\u0007\u00e1\b\u0007\u0001\u0007\u0001\u0007\u0001"
          + "\b\u0001\b\u0001\b\u0001\t\u0001\t\u0003\t\u00ea\b\t\u0001\t\u0001\t\u0003"
          + "\t\u00ee\b\t\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001\u000b"
          + "\u0003\u000b\u00f6\b\u000b\u0001\f\u0001\f\u0001\f\u0003\f\u00fb\b\f\u0001"
          + "\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u0104\b\f\u0001"
          + "\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0003\r\u010c\b\r\u0001\r\u0001"
          + "\r\u0003\r\u0110\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0115"
          + "\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001"
          + "\u0010\u0001\u0010\u0005\u0010\u011e\b\u0010\n\u0010\f\u0010\u0121\t\u0010"
          + "\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u0126\b\u0011\u0001\u0012"
          + "\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0013\u0001\u0014"
          + "\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014"
          + "\u0003\u0014\u0135\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"
          + "\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"
          + "\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"
          + "\u0001\u0015\u0001\u0015\u0003\u0015\u0149\b\u0015\u0001\u0015\u0001\u0015"
          + "\u0003\u0015\u014d\b\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0151\b"
          + "\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"
          + "\u0015\u0003\u0015\u0159\b\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001"
          + "\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0162\b\u0015\u0001"
          + "\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u0167\b\u0015\u0001\u0015\u0001"
          + "\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015\u016f"
          + "\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u0174\b\u0016"
          + "\u0001\u0017\u0001\u0017\u0001\u0017\u0003\u0017\u0179\b\u0017\u0001\u0017"
          + "\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0180\b\u0018"
          + "\u0001\u0018\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u0019\u0003\u0019"
          + "\u0187\b\u0019\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"
          + "\u0003\u001a\u018e\b\u001a\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b"
          + "\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001c\u0001\u001c"
          + "\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001c\u0001\u001d\u0001\u001d"
          + "\u0003\u001d\u01a0\b\u001d\u0001\u001d\u0001\u001d\u0003\u001d\u01a4\b"
          + "\u001d\u0003\u001d\u01a6\b\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0004"
          + "\u001e\u01ab\b\u001e\u000b\u001e\f\u001e\u01ac\u0001\u001f\u0001\u001f"
          + "\u0001\u001f\u0001\u001f\u0003\u001f\u01b3\b\u001f\u0001 \u0001 \u0001"
          + " \u0003 \u01b8\b \u0001!\u0001!\u0001!\u0001!\u0001\"\u0001\"\u0001\""
          + "\u0001\"\u0001\"\u0001#\u0001#\u0001#\u0001#\u0003#\u01c7\b#\u0001#\u0003"
          + "#\u01ca\b#\u0001$\u0001$\u0001$\u0003$\u01cf\b$\u0001$\u0003$\u01d2\b"
          + "$\u0001$\u0001$\u0001%\u0001%\u0001%\u0001&\u0001&\u0001&\u0001\'\u0003"
          + "\'\u01dd\b\'\u0001\'\u0001\'\u0003\'\u01e1\b\'\u0001\'\u0001\'\u0001\'"
          + "\u0003\'\u01e6\b\'\u0001\'\u0001\'\u0001\'\u0001(\u0001(\u0001(\u0001"
          + "(\u0001)\u0001)\u0003)\u01f1\b)\u0001)\u0001)\u0005)\u01f5\b)\n)\f)\u01f8"
          + "\t)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0005*\u0200\b*\n*\f*\u0203"
          + "\t*\u0001*\u0001*\u0001*\u0001*\u0001*\u0001*\u0003*\u020b\b*\u0001*\u0001"
          + "*\u0003*\u020f\b*\u0001*\u0001*\u0001*\u0001*\u0003*\u0215\b*\u0001+\u0003"
          + "+\u0218\b+\u0001+\u0003+\u021b\b+\u0001+\u0001+\u0001+\u0003+\u0220\b"
          + "+\u0001+\u0001+\u0001+\u0001+\u0003+\u0226\b+\u0001+\u0003+\u0229\b+\u0001"
          + "+\u0001+\u0001+\u0001+\u0001+\u0001+\u0003+\u0231\b+\u0001+\u0003+\u0234"
          + "\b+\u0001+\u0001+\u0001+\u0003+\u0239\b+\u0001+\u0001+\u0001+\u0003+\u023e"
          + "\b+\u0001,\u0001,\u0001,\u0005,\u0243\b,\n,\f,\u0246\t,\u0001,\u0001,"
          + "\u0003,\u024a\b,\u0001,\u0003,\u024d\b,\u0001-\u0001-\u0001-\u0003-\u0252"
          + "\b-\u0001.\u0001.\u0001.\u0001/\u0001/\u0003/\u0259\b/\u0001/\u0001/\u0001"
          + "0\u00040\u025e\b0\u000b0\f0\u025f\u00011\u00011\u00011\u00011\u00012\u0005"
          + "2\u0267\b2\n2\f2\u026a\t2\u00012\u00032\u026d\b2\u00012\u00042\u0270\b"
          + "2\u000b2\f2\u0271\u00012\u00052\u0275\b2\n2\f2\u0278\t2\u00012\u00052"
          + "\u027b\b2\n2\f2\u027e\t2\u00013\u00033\u0281\b3\u00013\u00013\u00014\u0001"
          + "4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0003"
          + "4\u0290\b4\u00014\u00034\u0293\b4\u00014\u00014\u00014\u00034\u0298\b"
          + "4\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u00014\u0001"
          + "4\u00014\u00014\u00014\u00014\u00014\u00034\u02a9\b4\u00014\u00034\u02ac"
          + "\b4\u00015\u00015\u00015\u00015\u00015\u00015\u00015\u00035\u02b5\b5\u0001"
          + "6\u00016\u00016\u00016\u00056\u02bb\b6\n6\f6\u02be\t6\u00016\u00036\u02c1"
          + "\b6\u00036\u02c3\b6\u00016\u00016\u00017\u00037\u02c8\b7\u00017\u0001"
          + "7\u00037\u02cc\b7\u00018\u00018\u00018\u00058\u02d1\b8\n8\f8\u02d4\t8"
          + "\u00019\u00019\u00019\u00019\u00039\u02da\b9\u00019\u00019\u00019\u0001"
          + "9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"
          + "9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"
          + "9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"
          + "9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"
          + "9\u00019\u00019\u00039\u030a\b9\u00019\u00019\u00019\u00019\u00019\u0001"
          + "9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"
          + "9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"
          + "9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"
          + "9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"
          + "9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0001"
          + "9\u00019\u00019\u00019\u00019\u00039\u0348\b9\u00019\u00019\u00019\u0001"
          + "9\u00019\u00019\u00039\u0350\b9\u00019\u00019\u00039\u0354\b9\u00019\u0001"
          + "9\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u00019\u0005"
          + "9\u0361\b9\n9\f9\u0364\t9\u0001:\u0001:\u0001:\u0003:\u0369\b:\u0001;"
          + "\u0001;\u0001;\u0001;\u0005;\u036f\b;\n;\f;\u0372\t;\u0001;\u0003;\u0375"
          + "\b;\u0003;\u0377\b;\u0001;\u0001;\u0001<\u0001<\u0003<\u037d\b<\u0001"
          + "<\u0001<\u0003<\u0381\b<\u0001<\u0001<\u0003<\u0385\b<\u0001<\u0001<\u0001"
          + "<\u0003<\u038a\b<\u0001<\u0001<\u0001<\u0001<\u0003<\u0390\b<\u0001=\u0001"
          + "=\u0001=\u0003=\u0395\b=\u0001=\u0003=\u0398\b=\u0001>\u0001>\u0003>\u039c"
          + "\b>\u0001?\u0001?\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0001@\u0003"
          + "@\u03a7\b@\u0001A\u0001A\u0005A\u03ab\bA\nA\fA\u03ae\tA\u0001A\u0001A"
          + "\u0001B\u0001B\u0001B\u0001B\u0001B\u0003B\u03b7\bB\u0001C\u0001C\u0001"
          + "D\u0001D\u0001E\u0001E\u0001E\u0001E\u0001F\u0001F\u0001F\u0001F\u0001"
          + "G\u0001G\u0003G\u03c7\bG\u0001H\u0001H\u0001I\u0001I\u0001I\u0003I\u03ce"
          + "\bI\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"
          + "J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"
          + "J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"
          + "J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001"
          + "J\u0001J\u0001J\u0001J\u0001J\u0001J\u0001J\u0003J\u03fe\bJ\u0001K\u0001"
          + "K\u0001L\u0001L\u0001L\u0001L\u0003L\u0406\bL\u0001L\u0000\u0001rM\u0000"
          + "\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"
          + "\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"
          + "\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u0000\n\u0001"
          + "\u0000\u001a\u001c\u0001\u0000\u0016\u0017\u0001\u0000 \"\u0001\u0000"
          + "#&\u0001\u0000\'*\u0001\u00000;\u0001\u0000?C\u0001\u0000DG\u0004\u0000"
          + "bbkkppww\u0001\u0000op\u04ad\u0000\u009b\u0001\u0000\u0000\u0000\u0002"
          + "\u009f\u0001\u0000\u0000\u0000\u0004\u00b5\u0001\u0000\u0000\u0000\u0006"
          + "\u00b7\u0001\u0000\u0000\u0000\b\u00be\u0001\u0000\u0000\u0000\n\u00c2"
          + "\u0001\u0000\u0000\u0000\f\u00d1\u0001\u0000\u0000\u0000\u000e\u00d3\u0001"
          + "\u0000\u0000\u0000\u0010\u00e4\u0001\u0000\u0000\u0000\u0012\u00e9\u0001"
          + "\u0000\u0000\u0000\u0014\u00ef\u0001\u0000\u0000\u0000\u0016\u00f2\u0001"
          + "\u0000\u0000\u0000\u0018\u0103\u0001\u0000\u0000\u0000\u001a\u010f\u0001"
          + "\u0000\u0000\u0000\u001c\u0114\u0001\u0000\u0000\u0000\u001e\u0116\u0001"
          + "\u0000\u0000\u0000 \u0119\u0001\u0000\u0000\u0000\"\u0122\u0001\u0000"
          + "\u0000\u0000$\u0127\u0001\u0000\u0000\u0000&\u0129\u0001\u0000\u0000\u0000"
          + "(\u012d\u0001\u0000\u0000\u0000*\u016e\u0001\u0000\u0000\u0000,\u0173"
          + "\u0001\u0000\u0000\u0000.\u0175\u0001\u0000\u0000\u00000\u017c\u0001\u0000"
          + "\u0000\u00002\u0183\u0001\u0000\u0000\u00004\u018a\u0001\u0000\u0000\u0000"
          + "6\u0191\u0001\u0000\u0000\u00008\u0197\u0001\u0000\u0000\u0000:\u019d"
          + "\u0001\u0000\u0000\u0000<\u01aa\u0001\u0000\u0000\u0000>\u01ae\u0001\u0000"
          + "\u0000\u0000@\u01b4\u0001\u0000\u0000\u0000B\u01b9\u0001\u0000\u0000\u0000"
          + "D\u01bd\u0001\u0000\u0000\u0000F\u01c2\u0001\u0000\u0000\u0000H\u01cb"
          + "\u0001\u0000\u0000\u0000J\u01d5\u0001\u0000\u0000\u0000L\u01d8\u0001\u0000"
          + "\u0000\u0000N\u01dc\u0001\u0000\u0000\u0000P\u01ea\u0001\u0000\u0000\u0000"
          + "R\u01f0\u0001\u0000\u0000\u0000T\u0214\u0001\u0000\u0000\u0000V\u023d"
          + "\u0001\u0000\u0000\u0000X\u024c\u0001\u0000\u0000\u0000Z\u024e\u0001\u0000"
          + "\u0000\u0000\\\u0253\u0001\u0000\u0000\u0000^\u0256\u0001\u0000\u0000"
          + "\u0000`\u025d\u0001\u0000\u0000\u0000b\u0261\u0001\u0000\u0000\u0000d"
          + "\u0268\u0001\u0000\u0000\u0000f\u0280\u0001\u0000\u0000\u0000h\u02ab\u0001"
          + "\u0000\u0000\u0000j\u02b4\u0001\u0000\u0000\u0000l\u02b6\u0001\u0000\u0000"
          + "\u0000n\u02c7\u0001\u0000\u0000\u0000p\u02cd\u0001\u0000\u0000\u0000r"
          + "\u0309\u0001\u0000\u0000\u0000t\u0368\u0001\u0000\u0000\u0000v\u036a\u0001"
          + "\u0000\u0000\u0000x\u038f\u0001\u0000\u0000\u0000z\u0397\u0001\u0000\u0000"
          + "\u0000|\u039b\u0001\u0000\u0000\u0000~\u039d\u0001\u0000\u0000\u0000\u0080"
          + "\u03a6\u0001\u0000\u0000\u0000\u0082\u03a8\u0001\u0000\u0000\u0000\u0084"
          + "\u03b6\u0001\u0000\u0000\u0000\u0086\u03b8\u0001\u0000\u0000\u0000\u0088"
          + "\u03ba\u0001\u0000\u0000\u0000\u008a\u03bc\u0001\u0000\u0000\u0000\u008c"
          + "\u03c0\u0001\u0000\u0000\u0000\u008e\u03c6\u0001\u0000\u0000\u0000\u0090"
          + "\u03c8\u0001\u0000\u0000\u0000\u0092\u03cd\u0001\u0000\u0000\u0000\u0094"
          + "\u03fd\u0001\u0000\u0000\u0000\u0096\u03ff\u0001\u0000\u0000\u0000\u0098"
          + "\u0405\u0001\u0000\u0000\u0000\u009a\u009c\u0003`0\u0000\u009b\u009a\u0001"
          + "\u0000\u0000\u0000\u009b\u009c\u0001\u0000\u0000\u0000\u009c\u009d\u0001"
          + "\u0000\u0000\u0000\u009d\u009e\u0005\u0000\u0000\u0001\u009e\u0001\u0001"
          + "\u0000\u0000\u0000\u009f\u00a0\u0003\u0004\u0002\u0000\u00a0\u0003\u0001"
          + "\u0000\u0000\u0000\u00a1\u00b6\u0003\u0006\u0003\u0000\u00a2\u00b6\u0003"
          + "\u001e\u000f\u0000\u00a3\u00b6\u0003\n\u0005\u0000\u00a4\u00b6\u0003\u0018"
          + "\f\u0000\u00a5\u00b6\u0003$\u0012\u0000\u00a6\u00b6\u0003P(\u0000\u00a7"
          + "\u00b6\u0003&\u0013\u0000\u00a8\u00b6\u0003(\u0014\u0000\u00a9\u00b6\u0003"
          + "*\u0015\u0000\u00aa\u00b6\u0003.\u0017\u0000\u00ab\u00b6\u00030\u0018"
          + "\u0000\u00ac\u00b6\u00032\u0019\u0000\u00ad\u00b6\u00034\u001a\u0000\u00ae"
          + "\u00b6\u00036\u001b\u0000\u00af\u00b6\u0003B!\u0000\u00b0\u00b6\u0003"
          + "8\u001c\u0000\u00b1\u00b6\u0003D\"\u0000\u00b2\u00b6\u0003F#\u0000\u00b3"
          + "\u00b6\u0003L&\u0000\u00b4\u00b6\u0003N\'\u0000\u00b5\u00a1\u0001\u0000"
          + "\u0000\u0000\u00b5\u00a2\u0001\u0000\u0000\u0000\u00b5\u00a3\u0001\u0000"
          + "\u0000\u0000\u00b5\u00a4\u0001\u0000\u0000\u0000\u00b5\u00a5\u0001\u0000"
          + "\u0000\u0000\u00b5\u00a6\u0001\u0000\u0000\u0000\u00b5\u00a7\u0001\u0000"
          + "\u0000\u0000\u00b5\u00a8\u0001\u0000\u0000\u0000\u00b5\u00a9\u0001\u0000"
          + "\u0000\u0000\u00b5\u00aa\u0001\u0000\u0000\u0000\u00b5\u00ab\u0001\u0000"
          + "\u0000\u0000\u00b5\u00ac\u0001\u0000\u0000\u0000\u00b5\u00ad\u0001\u0000"
          + "\u0000\u0000\u00b5\u00ae\u0001\u0000\u0000\u0000\u00b5\u00af\u0001\u0000"
          + "\u0000\u0000\u00b5\u00b0\u0001\u0000\u0000\u0000\u00b5\u00b1\u0001\u0000"
          + "\u0000\u0000\u00b5\u00b2\u0001\u0000\u0000\u0000\u00b5\u00b3\u0001\u0000"
          + "\u0000\u0000\u00b5\u00b4\u0001\u0000\u0000\u0000\u00b6\u0005\u0001\u0000"
          + "\u0000\u0000\u00b7\u00b9\u0005\t\u0000\u0000\u00b8\u00ba\u0003\b\u0004"
          + "\u0000\u00b9\u00b8\u0001\u0000\u0000\u0000\u00b9\u00ba\u0001\u0000\u0000"
          + "\u0000\u00ba\u00bb\u0001\u0000\u0000\u0000\u00bb\u00bc\u0005\u000b\u0000"
          + "\u0000\u00bc\u0007\u0001\u0000\u0000\u0000\u00bd\u00bf\u0003\u0004\u0002"
          + "\u0000\u00be\u00bd\u0001\u0000\u0000\u0000\u00bf\u00c0\u0001\u0000\u0000"
          + "\u0000\u00c0\u00be\u0001\u0000\u0000\u0000\u00c0\u00c1\u0001\u0000\u0000"
          + "\u0000\u00c1\t\u0001\u0000\u0000\u0000\u00c2\u00c3\u0005j\u0000\u0000"
          + "\u00c3\u00c4\u0003\f\u0006\u0000\u00c4\u000b\u0001\u0000\u0000\u0000\u00c5"
          + "\u00c7\u0003\u0010\b\u0000\u00c6\u00c5\u0001\u0000\u0000\u0000\u00c6\u00c7"
          + "\u0001\u0000\u0000\u0000\u00c7\u00ca\u0001\u0000\u0000\u0000\u00c8\u00cb"
          + "\u0003\u0012\t\u0000\u00c9\u00cb\u0003\u000e\u0007\u0000\u00ca\u00c8\u0001"
          + "\u0000\u0000\u0000\u00ca\u00c9\u0001\u0000\u0000\u0000\u00cb\u00cc\u0001"
          + "\u0000\u0000\u0000\u00cc\u00cd\u0003\u0014\n\u0000\u00cd\u00ce\u0003\u0098"
          + "L\u0000\u00ce\u00d2\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005x\u0000\u0000"
          + "\u00d0\u00d2\u0003\u0098L\u0000\u00d1\u00c6\u0001\u0000\u0000\u0000\u00d1"
          + "\u00cf\u0001\u0000\u0000\u0000\u00d2\r\u0001\u0000\u0000\u0000\u00d3\u00d9"
          + "\u0005\t\u0000\u0000\u00d4\u00d5\u0003\u0016\u000b\u0000\u00d5\u00d6\u0005"
          + "\r\u0000\u0000\u00d6\u00d8\u0001\u0000\u0000\u0000\u00d7\u00d4\u0001\u0000"
          + "\u0000\u0000\u00d8\u00db\u0001\u0000\u0000\u0000\u00d9\u00d7\u0001\u0000"
          + "\u0000\u0000\u00d9\u00da\u0001\u0000\u0000\u0000\u00da\u00e0\u0001\u0000"
          + "\u0000\u0000\u00db\u00d9\u0001\u0000\u0000\u0000\u00dc\u00de\u0003\u0016"
          + "\u000b\u0000\u00dd\u00df\u0005\r\u0000\u0000\u00de\u00dd\u0001\u0000\u0000"
          + "\u0000\u00de\u00df\u0001\u0000\u0000\u0000\u00df\u00e1\u0001\u0000\u0000"
          + "\u0000\u00e0\u00dc\u0001\u0000\u0000\u0000\u00e0\u00e1\u0001\u0000\u0000"
          + "\u0000\u00e1\u00e2\u0001\u0000\u0000\u0000\u00e2\u00e3\u0005\u000b\u0000"
          + "\u0000\u00e3\u000f\u0001\u0000\u0000\u0000\u00e4\u00e5\u0003\u0016\u000b"
          + "\u0000\u00e5\u00e6\u0005\r\u0000\u0000\u00e6\u0011\u0001\u0000\u0000\u0000"
          + "\u00e7\u00ea\u0005\u001a\u0000\u0000\u00e8\u00ea\u0003\u008eG\u0000\u00e9"
          + "\u00e7\u0001\u0000\u0000\u0000\u00e9\u00e8\u0001\u0000\u0000\u0000\u00ea"
          + "\u00ed\u0001\u0000\u0000\u0000\u00eb\u00ec\u0005b\u0000\u0000\u00ec\u00ee"
          + "\u0003\u008eG\u0000\u00ed\u00eb\u0001\u0000\u0000\u0000\u00ed\u00ee\u0001"
          + "\u0000\u0000\u0000\u00ee\u0013\u0001\u0000\u0000\u0000\u00ef\u00f0\u0005"
          + "c\u0000\u0000\u00f0\u00f1\u0005x\u0000\u0000\u00f1\u0015\u0001\u0000\u0000"
          + "\u0000\u00f2\u00f5\u0003\u008eG\u0000\u00f3\u00f4\u0005b\u0000\u0000\u00f4"
          + "\u00f6\u0003\u008eG\u0000\u00f5\u00f3\u0001\u0000\u0000\u0000\u00f5\u00f6"
          + "\u0001\u0000\u0000\u0000\u00f6\u0017\u0001\u0000\u0000\u0000\u00f7\u00fa"
          + "\u0005i\u0000\u0000\u00f8\u00fb\u0003\u001a\r\u0000\u00f9\u00fb\u0003"
          + "\u001c\u000e\u0000\u00fa\u00f8\u0001\u0000\u0000\u0000\u00fa\u00f9\u0001"
          + "\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fd\u0003"
          + "\u0098L\u0000\u00fd\u0104\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005i\u0000"
          + "\u0000\u00ff\u0100\u0005\\\u0000\u0000\u0100\u0101\u0003r9\u0000\u0101"
          + "\u0102\u0003\u0098L\u0000\u0102\u0104\u0001\u0000\u0000\u0000\u0103\u00f7"
          + "\u0001\u0000\u0000\u0000\u0103\u00fe\u0001\u0000\u0000\u0000\u0104\u0019"
          + "\u0001\u0000\u0000\u0000\u0105\u0106\u0003\u0012\t\u0000\u0106\u0107\u0003"
          + "\u0014\n\u0000\u0107\u0108\u0003\u0098L\u0000\u0108\u0110\u0001\u0000"
          + "\u0000\u0000\u0109\u010b\u0003\u000e\u0007\u0000\u010a\u010c\u0003\u0014"
          + "\n\u0000\u010b\u010a\u0001\u0000\u0000\u0000\u010b\u010c\u0001\u0000\u0000"
          + "\u0000\u010c\u010d\u0001\u0000\u0000\u0000\u010d\u010e\u0003\u0098L\u0000"
          + "\u010e\u0110\u0001\u0000\u0000\u0000\u010f\u0105\u0001\u0000\u0000\u0000"
          + "\u010f\u0109\u0001\u0000\u0000\u0000\u0110\u001b\u0001\u0000\u0000\u0000"
          + "\u0111\u0115\u0003\u001e\u000f\u0000\u0112\u0115\u0003P(\u0000\u0113\u0115"
          + "\u0003N\'\u0000\u0114\u0111\u0001\u0000\u0000\u0000\u0114\u0112\u0001"
          + "\u0000\u0000\u0000\u0114\u0113\u0001\u0000\u0000\u0000\u0115\u001d\u0001"
          + "\u0000\u0000\u0000\u0116\u0117\u0003 \u0010\u0000\u0117\u0118\u0003\u0098"
          + "L\u0000\u0118\u001f\u0001\u0000\u0000\u0000\u0119\u011a\u0003,\u0016\u0000"
          + "\u011a\u011f\u0003\"\u0011\u0000\u011b\u011c\u0005\r\u0000\u0000\u011c"
          + "\u011e\u0003\"\u0011\u0000\u011d\u011b\u0001\u0000\u0000\u0000\u011e\u0121"
          + "\u0001\u0000\u0000\u0000\u011f\u011d\u0001\u0000\u0000\u0000\u011f\u0120"
          + "\u0001\u0000\u0000\u0000\u0120!\u0001\u0000\u0000\u0000\u0121\u011f\u0001"
          + "\u0000\u0000\u0000\u0122\u0125\u0003t:\u0000\u0123\u0124\u0005\u000e\u0000"
          + "\u0000\u0124\u0126\u0003r9\u0000\u0125\u0123\u0001\u0000\u0000\u0000\u0125"
          + "\u0126\u0001\u0000\u0000\u0000\u0126#\u0001\u0000\u0000\u0000\u0127\u0128"
          + "\u0005\f\u0000\u0000\u0128%\u0001\u0000\u0000\u0000\u0129\u012a\u0004"
          + "\u0013\u0000\u0000\u012a\u012b\u0003p8\u0000\u012b\u012c\u0003\u0098L"
          + "\u0000\u012c\'\u0001\u0000\u0000\u0000\u012d\u012e\u0005]\u0000\u0000"
          + "\u012e\u012f\u0005\u0007\u0000\u0000\u012f\u0130\u0003p8\u0000\u0130\u0131"
          + "\u0005\b\u0000\u0000\u0131\u0134\u0003\u0004\u0002\u0000\u0132\u0133\u0005"
          + "M\u0000\u0000\u0133\u0135\u0003\u0004\u0002\u0000\u0134\u0132\u0001\u0000"
          + "\u0000\u0000\u0134\u0135\u0001\u0000\u0000\u0000\u0135)\u0001\u0000\u0000"
          + "\u0000\u0136\u0137\u0005I\u0000\u0000\u0137\u0138\u0003\u0004\u0002\u0000"
          + "\u0138\u0139\u0005W\u0000\u0000\u0139\u013a\u0005\u0007\u0000\u0000\u013a"
          + "\u013b\u0003p8\u0000\u013b\u013c\u0005\b\u0000\u0000\u013c\u013d\u0003"
          + "\u0098L\u0000\u013d\u016f\u0001\u0000\u0000\u0000\u013e\u013f\u0005W\u0000"
          + "\u0000\u013f\u0140\u0005\u0007\u0000\u0000\u0140\u0141\u0003p8\u0000\u0141"
          + "\u0142\u0005\b\u0000\u0000\u0142\u0143\u0003\u0004\u0002\u0000\u0143\u016f"
          + "\u0001\u0000\u0000\u0000\u0144\u0145\u0005U\u0000\u0000\u0145\u0148\u0005"
          + "\u0007\u0000\u0000\u0146\u0149\u0003p8\u0000\u0147\u0149\u0003 \u0010"
          + "\u0000\u0148\u0146\u0001\u0000\u0000\u0000\u0148\u0147\u0001\u0000\u0000"
          + "\u0000\u0148\u0149\u0001\u0000\u0000\u0000\u0149\u014a\u0001\u0000\u0000"
          + "\u0000\u014a\u014c\u0005\f\u0000\u0000\u014b\u014d\u0003p8\u0000\u014c"
          + "\u014b\u0001\u0000\u0000\u0000\u014c\u014d\u0001\u0000\u0000\u0000\u014d"
          + "\u014e\u0001\u0000\u0000\u0000\u014e\u0150\u0005\f\u0000\u0000\u014f\u0151"
          + "\u0003p8\u0000\u0150\u014f\u0001\u0000\u0000\u0000\u0150\u0151\u0001\u0000"
          + "\u0000\u0000\u0151\u0152\u0001\u0000\u0000\u0000\u0152\u0153\u0005\b\u0000"
          + "\u0000\u0153\u016f\u0003\u0004\u0002\u0000\u0154\u0155\u0005U\u0000\u0000"
          + "\u0155\u0158\u0005\u0007\u0000\u0000\u0156\u0159\u0003r9\u0000\u0157\u0159"
          + "\u0003 \u0010\u0000\u0158\u0156\u0001\u0000\u0000\u0000\u0158\u0157\u0001"
          + "\u0000\u0000\u0000\u0159\u015a\u0001\u0000\u0000\u0000\u015a\u015b\u0005"
          + "`\u0000\u0000\u015b\u015c\u0003p8\u0000\u015c\u015d\u0005\b\u0000\u0000"
          + "\u015d\u015e\u0003\u0004\u0002\u0000\u015e\u016f\u0001\u0000\u0000\u0000"
          + "\u015f\u0161\u0005U\u0000\u0000\u0160\u0162\u0005l\u0000\u0000\u0161\u0160"
          + "\u0001\u0000\u0000\u0000\u0161\u0162\u0001\u0000\u0000\u0000\u0162\u0163"
          + "\u0001\u0000\u0000\u0000\u0163\u0166\u0005\u0007\u0000\u0000\u0164\u0167"
          + "\u0003r9\u0000\u0165\u0167\u0003 \u0010\u0000\u0166\u0164\u0001\u0000"
          + "\u0000\u0000\u0166\u0165\u0001\u0000\u0000\u0000\u0167\u0168\u0001\u0000"
          + "\u0000\u0000\u0168\u0169\u0003\u0090H\u0000\u0169\u016a\u0004\u0015\u0001"
          + "\u0000\u016a\u016b\u0003p8\u0000\u016b\u016c\u0005\b\u0000\u0000\u016c"
          + "\u016d\u0003\u0004\u0002\u0000\u016d\u016f\u0001\u0000\u0000\u0000\u016e"
          + "\u0136\u0001\u0000\u0000\u0000\u016e\u013e\u0001\u0000\u0000\u0000\u016e"
          + "\u0144\u0001\u0000\u0000\u0000\u016e\u0154\u0001\u0000\u0000\u0000\u016e"
          + "\u015f\u0001\u0000\u0000\u0000\u016f+\u0001\u0000\u0000\u0000\u0170\u0174"
          + "\u0005O\u0000\u0000\u0171\u0174\u0003\u0096K\u0000\u0172\u0174\u0005h"
          + "\u0000\u0000\u0173\u0170\u0001\u0000\u0000\u0000\u0173\u0171\u0001\u0000"
          + "\u0000\u0000\u0173\u0172\u0001\u0000\u0000\u0000\u0174-\u0001\u0000\u0000"
          + "\u0000\u0175\u0178\u0005T\u0000\u0000\u0176\u0177\u0004\u0017\u0002\u0000"
          + "\u0177\u0179\u0003\u0090H\u0000\u0178\u0176\u0001\u0000\u0000\u0000\u0178"
          + "\u0179\u0001\u0000\u0000\u0000\u0179\u017a\u0001\u0000\u0000\u0000\u017a"
          + "\u017b\u0003\u0098L\u0000\u017b/\u0001\u0000\u0000\u0000\u017c\u017f\u0005"
          + "H\u0000\u0000\u017d\u017e\u0004\u0018\u0003\u0000\u017e\u0180\u0003\u0090"
          + "H\u0000\u017f\u017d\u0001\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000"
          + "\u0000\u0180\u0181\u0001\u0000\u0000\u0000\u0181\u0182\u0003\u0098L\u0000"
          + "\u01821\u0001\u0000\u0000\u0000\u0183\u0186\u0005R\u0000\u0000\u0184\u0185"
          + "\u0004\u0019\u0004\u0000\u0185\u0187\u0003p8\u0000\u0186\u0184\u0001\u0000"
          + "\u0000\u0000\u0186\u0187\u0001\u0000\u0000\u0000\u0187\u0188\u0001\u0000"
          + "\u0000\u0000\u0188\u0189\u0003\u0098L\u0000\u01893\u0001\u0000\u0000\u0000"
          + "\u018a\u018d\u0005m\u0000\u0000\u018b\u018c\u0004\u001a\u0005\u0000\u018c"
          + "\u018e\u0003p8\u0000\u018d\u018b\u0001\u0000\u0000\u0000\u018d\u018e\u0001"
          + "\u0000\u0000\u0000\u018e\u018f\u0001\u0000\u0000\u0000\u018f\u0190\u0003"
          + "\u0098L\u0000\u01905\u0001\u0000\u0000\u0000\u0191\u0192\u0005[\u0000"
          + "\u0000\u0192\u0193\u0005\u0007\u0000\u0000\u0193\u0194\u0003p8\u0000\u0194"
          + "\u0195\u0005\b\u0000\u0000\u0195\u0196\u0003\u0004\u0002\u0000\u01967"
          + "\u0001\u0000\u0000\u0000\u0197\u0198\u0005V\u0000\u0000\u0198\u0199\u0005"
          + "\u0007\u0000\u0000\u0199\u019a\u0003p8\u0000\u019a\u019b\u0005\b\u0000"
          + "\u0000\u019b\u019c\u0003:\u001d\u0000\u019c9\u0001\u0000\u0000\u0000\u019d"
          + "\u019f\u0005\t\u0000\u0000\u019e\u01a0\u0003<\u001e\u0000\u019f\u019e"
          + "\u0001\u0000\u0000\u0000\u019f\u01a0\u0001\u0000\u0000\u0000\u01a0\u01a5"
          + "\u0001\u0000\u0000\u0000\u01a1\u01a3\u0003@ \u0000\u01a2\u01a4\u0003<"
          + "\u001e\u0000\u01a3\u01a2\u0001\u0000\u0000\u0000\u01a3\u01a4\u0001\u0000"
          + "\u0000\u0000\u01a4\u01a6\u0001\u0000\u0000\u0000\u01a5\u01a1\u0001\u0000"
          + "\u0000\u0000\u01a5\u01a6\u0001\u0000\u0000\u0000\u01a6\u01a7\u0001\u0000"
          + "\u0000\u0000\u01a7\u01a8\u0005\u000b\u0000\u0000\u01a8;\u0001\u0000\u0000"
          + "\u0000\u01a9\u01ab\u0003>\u001f\u0000\u01aa\u01a9\u0001\u0000\u0000\u0000"
          + "\u01ab\u01ac\u0001\u0000\u0000\u0000\u01ac\u01aa\u0001\u0000\u0000\u0000"
          + "\u01ac\u01ad\u0001\u0000\u0000\u0000\u01ad=\u0001\u0000\u0000\u0000\u01ae"
          + "\u01af\u0005L\u0000\u0000\u01af\u01b0\u0003p8\u0000\u01b0\u01b2\u0005"
          + "\u0011\u0000\u0000\u01b1\u01b3\u0003\b\u0004\u0000\u01b2\u01b1\u0001\u0000"
          + "\u0000\u0000\u01b2\u01b3\u0001\u0000\u0000\u0000\u01b3?\u0001\u0000\u0000"
          + "\u0000\u01b4\u01b5\u0005\\\u0000\u0000\u01b5\u01b7\u0005\u0011\u0000\u0000"
          + "\u01b6\u01b8\u0003\b\u0004\u0000\u01b7\u01b6\u0001\u0000\u0000\u0000\u01b7"
          + "\u01b8\u0001\u0000\u0000\u0000\u01b8A\u0001\u0000\u0000\u0000\u01b9\u01ba"
          + "\u0003\u0090H\u0000\u01ba\u01bb\u0005\u0011\u0000\u0000\u01bb\u01bc\u0003"
          + "\u0004\u0002\u0000\u01bcC\u0001\u0000\u0000\u0000\u01bd\u01be\u0005^\u0000"
          + "\u0000\u01be\u01bf\u0004\"\u0006\u0000\u01bf\u01c0\u0003p8\u0000\u01c0"
          + "\u01c1\u0003\u0098L\u0000\u01c1E\u0001\u0000\u0000\u0000\u01c2\u01c3\u0005"
          + "a\u0000\u0000\u01c3\u01c9\u0003\u0006\u0003\u0000\u01c4\u01c6\u0003H$"
          + "\u0000\u01c5\u01c7\u0003J%\u0000\u01c6\u01c5\u0001\u0000\u0000\u0000\u01c6"
          + "\u01c7\u0001\u0000\u0000\u0000\u01c7\u01ca\u0001\u0000\u0000\u0000\u01c8"
          + "\u01ca\u0003J%\u0000\u01c9\u01c4\u0001\u0000\u0000\u0000\u01c9\u01c8\u0001"
          + "\u0000\u0000\u0000\u01caG\u0001\u0000\u0000\u0000\u01cb\u01d1\u0005P\u0000"
          + "\u0000\u01cc\u01ce\u0005\u0007\u0000\u0000\u01cd\u01cf\u0003t:\u0000\u01ce"
          + "\u01cd\u0001\u0000\u0000\u0000\u01ce\u01cf\u0001\u0000\u0000\u0000\u01cf"
          + "\u01d0\u0001\u0000\u0000\u0000\u01d0\u01d2\u0005\b\u0000\u0000\u01d1\u01cc"
          + "\u0001\u0000\u0000\u0000\u01d1\u01d2\u0001\u0000\u0000\u0000\u01d2\u01d3"
          + "\u0001\u0000\u0000\u0000\u01d3\u01d4\u0003\u0006\u0003\u0000\u01d4I\u0001"
          + "\u0000\u0000\u0000\u01d5\u01d6\u0005Q\u0000\u0000\u01d6\u01d7\u0003\u0006"
          + "\u0003\u0000\u01d7K\u0001\u0000\u0000\u0000\u01d8\u01d9\u0005X\u0000\u0000"
          + "\u01d9\u01da\u0003\u0098L\u0000\u01daM\u0001\u0000\u0000\u0000\u01db\u01dd"
          + "\u0005k\u0000\u0000\u01dc\u01db\u0001\u0000\u0000\u0000\u01dc\u01dd\u0001"
          + "\u0000\u0000\u0000\u01dd\u01de\u0001\u0000\u0000\u0000\u01de\u01e0\u0005"
          + "Y\u0000\u0000\u01df\u01e1\u0005\u001a\u0000\u0000\u01e0\u01df\u0001\u0000"
          + "\u0000\u0000\u01e0\u01e1\u0001\u0000\u0000\u0000\u01e1\u01e2\u0001\u0000"
          + "\u0000\u0000\u01e2\u01e3\u0003\u0090H\u0000\u01e3\u01e5\u0005\u0007\u0000"
          + "\u0000\u01e4\u01e6\u0003X,\u0000\u01e5\u01e4\u0001\u0000\u0000\u0000\u01e5"
          + "\u01e6\u0001\u0000\u0000\u0000\u01e6\u01e7\u0001\u0000\u0000\u0000\u01e7"
          + "\u01e8\u0005\b\u0000\u0000\u01e8\u01e9\u0003^/\u0000\u01e9O\u0001\u0000"
          + "\u0000\u0000\u01ea\u01eb\u0005d\u0000\u0000\u01eb\u01ec\u0003\u0090H\u0000"
          + "\u01ec\u01ed\u0003R)\u0000\u01edQ\u0001\u0000\u0000\u0000\u01ee\u01ef"
          + "\u0005f\u0000\u0000\u01ef\u01f1\u0003r9\u0000\u01f0\u01ee\u0001\u0000"
          + "\u0000\u0000\u01f0\u01f1\u0001\u0000\u0000\u0000\u01f1\u01f2\u0001\u0000"
          + "\u0000\u0000\u01f2\u01f6\u0005\t\u0000\u0000\u01f3\u01f5\u0003T*\u0000"
          + "\u01f4\u01f3\u0001\u0000\u0000\u0000\u01f5\u01f8\u0001\u0000\u0000\u0000"
          + "\u01f6\u01f4\u0001\u0000\u0000\u0000\u01f6\u01f7\u0001\u0000\u0000\u0000"
          + "\u01f7\u01f9\u0001\u0000\u0000\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000"
          + "\u01f9\u01fa\u0005\u000b\u0000\u0000\u01faS\u0001\u0000\u0000\u0000\u01fb"
          + "\u0200\u0005v\u0000\u0000\u01fc\u01fd\u0004*\u0007\u0000\u01fd\u0200\u0003"
          + "\u0090H\u0000\u01fe\u0200\u0005k\u0000\u0000\u01ff\u01fb\u0001\u0000\u0000"
          + "\u0000\u01ff\u01fc\u0001\u0000\u0000\u0000\u01ff\u01fe\u0001\u0000\u0000"
          + "\u0000\u0200\u0203\u0001\u0000\u0000\u0000\u0201\u01ff\u0001\u0000\u0000"
          + "\u0000\u0201\u0202\u0001\u0000\u0000\u0000\u0202\u020a\u0001\u0000\u0000"
          + "\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0204\u020b\u0003V+\u0000\u0205"
          + "\u0206\u0003t:\u0000\u0206\u0207\u0005\u000e\u0000\u0000\u0207\u0208\u0003"
          + "v;\u0000\u0208\u0209\u0005\f\u0000\u0000\u0209\u020b\u0001\u0000\u0000"
          + "\u0000\u020a\u0204\u0001\u0000\u0000\u0000\u020a\u0205\u0001\u0000\u0000"
          + "\u0000\u020b\u0215\u0001\u0000\u0000\u0000\u020c\u0215\u0003$\u0012\u0000"
          + "\u020d\u020f\u0005\u001f\u0000\u0000\u020e\u020d\u0001\u0000\u0000\u0000"
          + "\u020e\u020f\u0001\u0000\u0000\u0000\u020f\u0210\u0001\u0000\u0000\u0000"
          + "\u0210\u0211\u0003j5\u0000\u0211\u0212\u0005\u000e\u0000\u0000\u0212\u0213"
          + "\u0003r9\u0000\u0213\u0215\u0001\u0000\u0000\u0000\u0214\u0201\u0001\u0000"
          + "\u0000\u0000\u0214\u020c\u0001\u0000\u0000\u0000\u0214\u020e\u0001\u0000"
          + "\u0000\u0000\u0215U\u0001\u0000\u0000\u0000\u0216\u0218\u0005\u001a\u0000"
          + "\u0000\u0217\u0216\u0001\u0000\u0000\u0000\u0217\u0218\u0001\u0000\u0000"
          + "\u0000\u0218\u021a\u0001\u0000\u0000\u0000\u0219\u021b\u0005\u001f\u0000"
          + "\u0000\u021a\u0219\u0001\u0000\u0000\u0000\u021a\u021b\u0001\u0000\u0000"
          + "\u0000\u021b\u021c\u0001\u0000\u0000\u0000\u021c\u021d\u0003j5\u0000\u021d"
          + "\u021f\u0005\u0007\u0000\u0000\u021e\u0220\u0003X,\u0000\u021f\u021e\u0001"
          + "\u0000\u0000\u0000\u021f\u0220\u0001\u0000\u0000\u0000\u0220\u0221\u0001"
          + "\u0000\u0000\u0000\u0221\u0222\u0005\b\u0000\u0000\u0222\u0223\u0003^"
          + "/\u0000\u0223\u023e\u0001\u0000\u0000\u0000\u0224\u0226\u0005\u001a\u0000"
          + "\u0000\u0225\u0224\u0001\u0000\u0000\u0000\u0225\u0226\u0001\u0000\u0000"
          + "\u0000\u0226\u0228\u0001\u0000\u0000\u0000\u0227\u0229\u0005\u001f\u0000"
          + "\u0000\u0228\u0227\u0001\u0000\u0000\u0000\u0228\u0229\u0001\u0000\u0000"
          + "\u0000\u0229\u022a\u0001\u0000\u0000\u0000\u022a\u022b\u0003\u008aE\u0000"
          + "\u022b\u022c\u0005\u0007\u0000\u0000\u022c\u022d\u0005\b\u0000\u0000\u022d"
          + "\u022e\u0003^/\u0000\u022e\u023e\u0001\u0000\u0000\u0000\u022f\u0231\u0005"
          + "\u001a\u0000\u0000\u0230\u022f\u0001\u0000\u0000\u0000\u0230\u0231\u0001"
          + "\u0000\u0000\u0000\u0231\u0233\u0001\u0000\u0000\u0000\u0232\u0234\u0005"
          + "\u001f\u0000\u0000\u0233\u0232\u0001\u0000\u0000\u0000\u0233\u0234\u0001"
          + "\u0000\u0000\u0000\u0234\u0235\u0001\u0000\u0000\u0000\u0235\u0236\u0003"
          + "\u008cF\u0000\u0236\u0238\u0005\u0007\u0000\u0000\u0237\u0239\u0003X,"
          + "\u0000\u0238\u0237\u0001\u0000\u0000\u0000\u0238\u0239\u0001\u0000\u0000"
          + "\u0000\u0239\u023a\u0001\u0000\u0000\u0000\u023a\u023b\u0005\b\u0000\u0000"
          + "\u023b\u023c\u0003^/\u0000\u023c\u023e\u0001\u0000\u0000\u0000\u023d\u0217"
          + "\u0001\u0000\u0000\u0000\u023d\u0225\u0001\u0000\u0000\u0000\u023d\u0230"
          + "\u0001\u0000\u0000\u0000\u023eW\u0001\u0000\u0000\u0000\u023f\u0244\u0003"
          + "Z-\u0000\u0240\u0241\u0005\r\u0000\u0000\u0241\u0243\u0003Z-\u0000\u0242"
          + "\u0240\u0001\u0000\u0000\u0000\u0243\u0246\u0001\u0000\u0000\u0000\u0244"
          + "\u0242\u0001\u0000\u0000\u0000\u0244\u0245\u0001\u0000\u0000\u0000\u0245"
          + "\u0249\u0001\u0000\u0000\u0000\u0246\u0244\u0001\u0000\u0000\u0000\u0247"
          + "\u0248\u0005\r\u0000\u0000\u0248\u024a\u0003\\.\u0000\u0249\u0247\u0001"
          + "\u0000\u0000\u0000\u0249\u024a\u0001\u0000\u0000\u0000\u024a\u024d\u0001"
          + "\u0000\u0000\u0000\u024b\u024d\u0003\\.\u0000\u024c\u023f\u0001\u0000"
          + "\u0000\u0000\u024c\u024b\u0001\u0000\u0000\u0000\u024dY\u0001\u0000\u0000"
          + "\u0000\u024e\u0251\u0003t:\u0000\u024f\u0250\u0005\u000e\u0000\u0000\u0250"
          + "\u0252\u0003r9\u0000\u0251\u024f\u0001\u0000\u0000\u0000\u0251\u0252\u0001"
          + "\u0000\u0000\u0000\u0252[\u0001\u0000\u0000\u0000\u0253\u0254\u0005\u0012"
          + "\u0000\u0000\u0254\u0255\u0003r9\u0000\u0255]\u0001\u0000\u0000\u0000"
          + "\u0256\u0258\u0005\t\u0000\u0000\u0257\u0259\u0003`0\u0000\u0258\u0257"
          + "\u0001\u0000\u0000\u0000\u0258\u0259\u0001\u0000\u0000\u0000\u0259\u025a"
          + "\u0001\u0000\u0000\u0000\u025a\u025b\u0005\u000b\u0000\u0000\u025b_\u0001"
          + "\u0000\u0000\u0000\u025c\u025e\u0003\u0002\u0001\u0000\u025d\u025c\u0001"
          + "\u0000\u0000\u0000\u025e\u025f\u0001\u0000\u0000\u0000\u025f\u025d\u0001"
          + "\u0000\u0000\u0000\u025f\u0260\u0001\u0000\u0000\u0000\u0260a\u0001\u0000"
          + "\u0000\u0000\u0261\u0262\u0005\u0005\u0000\u0000\u0262\u0263\u0003d2\u0000"
          + "\u0263\u0264\u0005\u0006\u0000\u0000\u0264c\u0001\u0000\u0000\u0000\u0265"
          + "\u0267\u0005\r\u0000\u0000\u0266\u0265\u0001\u0000\u0000\u0000\u0267\u026a"
          + "\u0001\u0000\u0000\u0000\u0268\u0266\u0001\u0000\u0000\u0000\u0268\u0269"
          + "\u0001\u0000\u0000\u0000\u0269\u026c\u0001\u0000\u0000\u0000\u026a\u0268"
          + "\u0001\u0000\u0000\u0000\u026b\u026d\u0003f3\u0000\u026c\u026b\u0001\u0000"
          + "\u0000\u0000\u026c\u026d\u0001\u0000\u0000\u0000\u026d\u0276\u0001\u0000"
          + "\u0000\u0000\u026e\u0270\u0005\r\u0000\u0000\u026f\u026e\u0001\u0000\u0000"
          + "\u0000\u0270\u0271\u0001\u0000\u0000\u0000\u0271\u026f\u0001\u0000\u0000"
          + "\u0000\u0271\u0272\u0001\u0000\u0000\u0000\u0272\u0273\u0001\u0000\u0000"
          + "\u0000\u0273\u0275\u0003f3\u0000\u0274\u026f\u0001\u0000\u0000\u0000\u0275"
          + "\u0278\u0001\u0000\u0000\u0000\u0276\u0274\u0001\u0000\u0000\u0000\u0276"
          + "\u0277\u0001\u0000\u0000\u0000\u0277\u027c\u0001\u0000\u0000\u0000\u0278"
          + "\u0276\u0001\u0000\u0000\u0000\u0279\u027b\u0005\r\u0000\u0000\u027a\u0279"
          + "\u0001\u0000\u0000\u0000\u027b\u027e\u0001\u0000\u0000\u0000\u027c\u027a"
          + "\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000\u027de\u0001"
          + "\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027f\u0281\u0005"
          + "\u0012\u0000\u0000\u0280\u027f\u0001\u0000\u0000\u0000\u0280\u0281\u0001"
          + "\u0000\u0000\u0000\u0281\u0282\u0001\u0000\u0000\u0000\u0282\u0283\u0003"
          + "r9\u0000\u0283g\u0001\u0000\u0000\u0000\u0284\u0285\u0003j5\u0000\u0285"
          + "\u0286\u0005\u0011\u0000\u0000\u0286\u0287\u0003r9\u0000\u0287\u02ac\u0001"
          + "\u0000\u0000\u0000\u0288\u0289\u0005\u0005\u0000\u0000\u0289\u028a\u0003"
          + "r9\u0000\u028a\u028b\u0005\u0006\u0000\u0000\u028b\u028c\u0005\u0011\u0000"
          + "\u0000\u028c\u028d\u0003r9\u0000\u028d\u02ac\u0001\u0000\u0000\u0000\u028e"
          + "\u0290\u0005k\u0000\u0000\u028f\u028e\u0001\u0000\u0000\u0000\u028f\u0290"
          + "\u0001\u0000\u0000\u0000\u0290\u0292\u0001\u0000\u0000\u0000\u0291\u0293"
          + "\u0005\u001a\u0000\u0000\u0292\u0291\u0001\u0000\u0000\u0000\u0292\u0293"
          + "\u0001\u0000\u0000\u0000\u0293\u0294\u0001\u0000\u0000\u0000\u0294\u0295"
          + "\u0003j5\u0000\u0295\u0297\u0005\u0007\u0000\u0000\u0296\u0298\u0003X"
          + ",\u0000\u0297\u0296\u0001\u0000\u0000\u0000\u0297\u0298\u0001\u0000\u0000"
          + "\u0000\u0298\u0299\u0001\u0000\u0000\u0000\u0299\u029a\u0005\b\u0000\u0000"
          + "\u029a\u029b\u0003^/\u0000\u029b\u02ac\u0001\u0000\u0000\u0000\u029c\u029d"
          + "\u0003\u008aE\u0000\u029d\u029e\u0005\u0007\u0000\u0000\u029e\u029f\u0005"
          + "\b\u0000\u0000\u029f\u02a0\u0003^/\u0000\u02a0\u02ac\u0001\u0000\u0000"
          + "\u0000\u02a1\u02a2\u0003\u008cF\u0000\u02a2\u02a3\u0005\u0007\u0000\u0000"
          + "\u02a3\u02a4\u0003Z-\u0000\u02a4\u02a5\u0005\b\u0000\u0000\u02a5\u02a6"
          + "\u0003^/\u0000\u02a6\u02ac\u0001\u0000\u0000\u0000\u02a7\u02a9\u0005\u0012"
          + "\u0000\u0000\u02a8\u02a7\u0001\u0000\u0000\u0000\u02a8\u02a9\u0001\u0000"
          + "\u0000\u0000\u02a9\u02aa\u0001\u0000\u0000\u0000\u02aa\u02ac\u0003r9\u0000"
          + "\u02ab\u0284\u0001\u0000\u0000\u0000\u02ab\u0288\u0001\u0000\u0000\u0000"
          + "\u02ab\u028f\u0001\u0000\u0000\u0000\u02ab\u029c\u0001\u0000\u0000\u0000"
          + "\u02ab\u02a1\u0001\u0000\u0000\u0000\u02ab\u02a8\u0001\u0000\u0000\u0000"
          + "\u02aci\u0001\u0000\u0000\u0000\u02ad\u02b5\u0003\u008eG\u0000\u02ae\u02b5"
          + "\u0005x\u0000\u0000\u02af\u02b5\u0003\u0086C\u0000\u02b0\u02b1\u0005\u0005"
          + "\u0000\u0000\u02b1\u02b2\u0003r9\u0000\u02b2\u02b3\u0005\u0006\u0000\u0000"
          + "\u02b3\u02b5\u0001\u0000\u0000\u0000\u02b4\u02ad\u0001\u0000\u0000\u0000"
          + "\u02b4\u02ae\u0001\u0000\u0000\u0000\u02b4\u02af\u0001\u0000\u0000\u0000"
          + "\u02b4\u02b0\u0001\u0000\u0000\u0000\u02b5k\u0001\u0000\u0000\u0000\u02b6"
          + "\u02c2\u0005\u0007\u0000\u0000\u02b7\u02bc\u0003n7\u0000\u02b8\u02b9\u0005"
          + "\r\u0000\u0000\u02b9\u02bb\u0003n7\u0000\u02ba\u02b8\u0001\u0000\u0000"
          + "\u0000\u02bb\u02be\u0001\u0000\u0000\u0000\u02bc\u02ba\u0001\u0000\u0000"
          + "\u0000\u02bc\u02bd\u0001\u0000\u0000\u0000\u02bd\u02c0\u0001\u0000\u0000"
          + "\u0000\u02be\u02bc\u0001\u0000\u0000\u0000\u02bf\u02c1\u0005\r\u0000\u0000"
          + "\u02c0\u02bf\u0001\u0000\u0000\u0000\u02c0\u02c1\u0001\u0000\u0000\u0000"
          + "\u02c1\u02c3\u0001\u0000\u0000\u0000\u02c2\u02b7\u0001\u0000\u0000\u0000"
          + "\u02c2\u02c3\u0001\u0000\u0000\u0000\u02c3\u02c4\u0001\u0000\u0000\u0000"
          + "\u02c4\u02c5\u0005\b\u0000\u0000\u02c5m\u0001\u0000\u0000\u0000\u02c6"
          + "\u02c8\u0005\u0012\u0000\u0000\u02c7\u02c6\u0001\u0000\u0000\u0000\u02c7"
          + "\u02c8\u0001\u0000\u0000\u0000\u02c8\u02cb\u0001\u0000\u0000\u0000\u02c9"
          + "\u02cc\u0003r9\u0000\u02ca\u02cc\u0003\u0090H\u0000\u02cb\u02c9\u0001"
          + "\u0000\u0000\u0000\u02cb\u02ca\u0001\u0000\u0000\u0000\u02cco\u0001\u0000"
          + "\u0000\u0000\u02cd\u02d2\u0003r9\u0000\u02ce\u02cf\u0005\r\u0000\u0000"
          + "\u02cf\u02d1\u0003r9\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d1\u02d4"
          + "\u0001\u0000\u0000\u0000\u02d2\u02d0\u0001\u0000\u0000\u0000\u02d2\u02d3"
          + "\u0001\u0000\u0000\u0000\u02d3q\u0001\u0000\u0000\u0000\u02d4\u02d2\u0001"
          + "\u0000\u0000\u0000\u02d5\u02d6\u00069\uffff\uffff\u0000\u02d6\u030a\u0003"
          + "x<\u0000\u02d7\u02d9\u0005d\u0000\u0000\u02d8\u02da\u0003\u0090H\u0000"
          + "\u02d9\u02d8\u0001\u0000\u0000\u0000\u02d9\u02da\u0001\u0000\u0000\u0000"
          + "\u02da\u02db\u0001\u0000\u0000\u0000\u02db\u030a\u0003R)\u0000\u02dc\u02dd"
          + "\u0005N\u0000\u0000\u02dd\u02de\u0003r9\u0000\u02de\u02df\u0003l6\u0000"
          + "\u02df\u030a\u0001\u0000\u0000\u0000\u02e0\u02e1\u0005N\u0000\u0000\u02e1"
          + "\u030a\u0003r9*\u02e2\u02e3\u0005N\u0000\u0000\u02e3\u02e4\u0005\u0013"
          + "\u0000\u0000\u02e4\u030a\u0003\u0090H\u0000\u02e5\u02e6\u0005_\u0000\u0000"
          + "\u02e6\u030a\u0003r9%\u02e7\u02e8\u0005S\u0000\u0000\u02e8\u030a\u0003"
          + "r9$\u02e9\u02ea\u0005K\u0000\u0000\u02ea\u030a\u0003r9#\u02eb\u02ec\u0005"
          + "\u0014\u0000\u0000\u02ec\u030a\u0003r9\"\u02ed\u02ee\u0005\u0015\u0000"
          + "\u0000\u02ee\u030a\u0003r9!\u02ef\u02f0\u0005\u0016\u0000\u0000\u02f0"
          + "\u030a\u0003r9 \u02f1\u02f2\u0005\u0017\u0000\u0000\u02f2\u030a\u0003"
          + "r9\u001f\u02f3\u02f4\u0005\u0018\u0000\u0000\u02f4\u030a\u0003r9\u001e"
          + "\u02f5\u02f6\u0005\u0019\u0000\u0000\u02f6\u030a\u0003r9\u001d\u02f7\u02f8"
          + "\u0005l\u0000\u0000\u02f8\u030a\u0003r9\u001c\u02f9\u02fa\u0005j\u0000"
          + "\u0000\u02fa\u02fb\u0005\u0007\u0000\u0000\u02fb\u02fc\u0003r9\u0000\u02fc"
          + "\u02fd\u0005\b\u0000\u0000\u02fd\u030a\u0001\u0000\u0000\u0000\u02fe\u030a"
          + "\u00034\u001a\u0000\u02ff\u030a\u0005Z\u0000\u0000\u0300\u030a\u0003\u0090"
          + "H\u0000\u0301\u030a\u0005g\u0000\u0000\u0302\u030a\u0003\u0080@\u0000"
          + "\u0303\u030a\u0003b1\u0000\u0304\u030a\u0003v;\u0000\u0305\u0306\u0005"
          + "\u0007\u0000\u0000\u0306\u0307\u0003p8\u0000\u0307\u0308\u0005\b\u0000"
          + "\u0000\u0308\u030a\u0001\u0000\u0000\u0000\u0309\u02d5\u0001\u0000\u0000"
          + "\u0000\u0309\u02d7\u0001\u0000\u0000\u0000\u0309\u02dc\u0001\u0000\u0000"
          + "\u0000\u0309\u02e0\u0001\u0000\u0000\u0000\u0309\u02e2\u0001\u0000\u0000"
          + "\u0000\u0309\u02e5\u0001\u0000\u0000\u0000\u0309\u02e7\u0001\u0000\u0000"
          + "\u0000\u0309\u02e9\u0001\u0000\u0000\u0000\u0309\u02eb\u0001\u0000\u0000"
          + "\u0000\u0309\u02ed\u0001\u0000\u0000\u0000\u0309\u02ef\u0001\u0000\u0000"
          + "\u0000\u0309\u02f1\u0001\u0000\u0000\u0000\u0309\u02f3\u0001\u0000\u0000"
          + "\u0000\u0309\u02f5\u0001\u0000\u0000\u0000\u0309\u02f7\u0001\u0000\u0000"
          + "\u0000\u0309\u02f9\u0001\u0000\u0000\u0000\u0309\u02fe\u0001\u0000\u0000"
          + "\u0000\u0309\u02ff\u0001\u0000\u0000\u0000\u0309\u0300\u0001\u0000\u0000"
          + "\u0000\u0309\u0301\u0001\u0000\u0000\u0000\u0309\u0302\u0001\u0000\u0000"
          + "\u0000\u0309\u0303\u0001\u0000\u0000\u0000\u0309\u0304\u0001\u0000\u0000"
          + "\u0000\u0309\u0305\u0001\u0000\u0000\u0000\u030a\u0362\u0001\u0000\u0000"
          + "\u0000\u030b\u030c\n.\u0000\u0000\u030c\u030d\u0005\u0010\u0000\u0000"
          + "\u030d\u0361\u0003r9/\u030e\u030f\n\u001b\u0000\u0000\u030f\u0310\u0005"
          + "\u001d\u0000\u0000\u0310\u0361\u0003r9\u001b\u0311\u0312\n\u001a\u0000"
          + "\u0000\u0312\u0313\u0007\u0000\u0000\u0000\u0313\u0361\u0003r9\u001b\u0314"
          + "\u0315\n\u0019\u0000\u0000\u0315\u0316\u0007\u0001\u0000\u0000\u0316\u0361"
          + "\u0003r9\u001a\u0317\u0318\n\u0018\u0000\u0000\u0318\u0319\u0005\u001e"
          + "\u0000\u0000\u0319\u0361\u0003r9\u0019\u031a\u031b\n\u0017\u0000\u0000"
          + "\u031b\u031c\u0007\u0002\u0000\u0000\u031c\u0361\u0003r9\u0018\u031d\u031e"
          + "\n\u0016\u0000\u0000\u031e\u031f\u0007\u0003\u0000\u0000\u031f\u0361\u0003"
          + "r9\u0017\u0320\u0321\n\u0015\u0000\u0000\u0321\u0322\u0005J\u0000\u0000"
          + "\u0322\u0361\u0003r9\u0016\u0323\u0324\n\u0014\u0000\u0000\u0324\u0325"
          + "\u0005`\u0000\u0000\u0325\u0361\u0003r9\u0015\u0326\u0327\n\u0013\u0000"
          + "\u0000\u0327\u0328\u0007\u0004\u0000\u0000\u0328\u0361\u0003r9\u0014\u0329"
          + "\u032a\n\u0012\u0000\u0000\u032a\u032b\u0005+\u0000\u0000\u032b\u0361"
          + "\u0003r9\u0013\u032c\u032d\n\u0011\u0000\u0000\u032d\u032e\u0005,\u0000"
          + "\u0000\u032e\u0361\u0003r9\u0012\u032f\u0330\n\u0010\u0000\u0000\u0330"
          + "\u0331\u0005-\u0000\u0000\u0331\u0361\u0003r9\u0011\u0332\u0333\n\u000f"
          + "\u0000\u0000\u0333\u0334\u0005.\u0000\u0000\u0334\u0361\u0003r9\u0010"
          + "\u0335\u0336\n\u000e\u0000\u0000\u0336\u0337\u0005/\u0000\u0000\u0337"
          + "\u0361\u0003r9\u000f\u0338\u0339\n\r\u0000\u0000\u0339\u033a\u0005\u000f"
          + "\u0000\u0000\u033a\u033b\u0003r9\u0000\u033b\u033c\u0005\u0011\u0000\u0000"
          + "\u033c\u033d\u0003r9\u000e\u033d\u0361\u0001\u0000\u0000\u0000\u033e\u033f"
          + "\n\f\u0000\u0000\u033f\u0340\u0005\u000e\u0000\u0000\u0340\u0361\u0003"
          + "r9\f\u0341\u0342\n\u000b\u0000\u0000\u0342\u0343\u0003~?\u0000\u0343\u0344"
          + "\u0003r9\u000b\u0344\u0361\u0001\u0000\u0000\u0000\u0345\u0347\n-\u0000"
          + "\u0000\u0346\u0348\u0005\u0010\u0000\u0000\u0347\u0346\u0001\u0000\u0000"
          + "\u0000\u0347\u0348\u0001\u0000\u0000\u0000\u0348\u0349\u0001\u0000\u0000"
          + "\u0000\u0349\u034a\u0005\u0005\u0000\u0000\u034a\u034b\u0003p8\u0000\u034b"
          + "\u034c\u0005\u0006\u0000\u0000\u034c\u0361\u0001\u0000\u0000\u0000\u034d"
          + "\u034f\n,\u0000\u0000\u034e\u0350\u0005\u000f\u0000\u0000\u034f\u034e"
          + "\u0001\u0000\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u0351"
          + "\u0001\u0000\u0000\u0000\u0351\u0353\u0005\u0013\u0000\u0000\u0352\u0354"
          + "\u0005\u001f\u0000\u0000\u0353\u0352\u0001\u0000\u0000\u0000\u0353\u0354"
          + "\u0001\u0000\u0000\u0000\u0354\u0355\u0001\u0000\u0000\u0000\u0355\u0361"
          + "\u0003\u008eG\u0000\u0356\u0357\n)\u0000\u0000\u0357\u0361\u0003l6\u0000"
          + "\u0358\u0359\n\'\u0000\u0000\u0359\u035a\u00049\u001e\u0000\u035a\u0361"
          + "\u0005\u0014\u0000\u0000\u035b\u035c\n&\u0000\u0000\u035c\u035d\u0004"
          + "9 \u0000\u035d\u0361\u0005\u0015\u0000\u0000\u035e\u035f\n\t\u0000\u0000"
          + "\u035f\u0361\u0003\u0082A\u0000\u0360\u030b\u0001\u0000\u0000\u0000\u0360"
          + "\u030e\u0001\u0000\u0000\u0000\u0360\u0311\u0001\u0000\u0000\u0000\u0360"
          + "\u0314\u0001\u0000\u0000\u0000\u0360\u0317\u0001\u0000\u0000\u0000\u0360"
          + "\u031a\u0001\u0000\u0000\u0000\u0360\u031d\u0001\u0000\u0000\u0000\u0360"
          + "\u0320\u0001\u0000\u0000\u0000\u0360\u0323\u0001\u0000\u0000\u0000\u0360"
          + "\u0326\u0001\u0000\u0000\u0000\u0360\u0329\u0001\u0000\u0000\u0000\u0360"
          + "\u032c\u0001\u0000\u0000\u0000\u0360\u032f\u0001\u0000\u0000\u0000\u0360"
          + "\u0332\u0001\u0000\u0000\u0000\u0360\u0335\u0001\u0000\u0000\u0000\u0360"
          + "\u0338\u0001\u0000\u0000\u0000\u0360\u033e\u0001\u0000\u0000\u0000\u0360"
          + "\u0341\u0001\u0000\u0000\u0000\u0360\u0345\u0001\u0000\u0000\u0000\u0360"
          + "\u034d\u0001\u0000\u0000\u0000\u0360\u0356\u0001\u0000\u0000\u0000\u0360"
          + "\u0358\u0001\u0000\u0000\u0000\u0360\u035b\u0001\u0000\u0000\u0000\u0360"
          + "\u035e\u0001\u0000\u0000\u0000\u0361\u0364\u0001\u0000\u0000\u0000\u0362"
          + "\u0360\u0001\u0000\u0000\u0000\u0362\u0363\u0001\u0000\u0000\u0000\u0363"
          + "s\u0001\u0000\u0000\u0000\u0364\u0362\u0001\u0000\u0000\u0000\u0365\u0369"
          + "\u0003\u0090H\u0000\u0366\u0369\u0003b1\u0000\u0367\u0369\u0003v;\u0000"
          + "\u0368\u0365\u0001\u0000\u0000\u0000\u0368\u0366\u0001\u0000\u0000\u0000"
          + "\u0368\u0367\u0001\u0000\u0000\u0000\u0369u\u0001\u0000\u0000\u0000\u036a"
          + "\u0376\u0005\t\u0000\u0000\u036b\u0370\u0003h4\u0000\u036c\u036d\u0005"
          + "\r\u0000\u0000\u036d\u036f\u0003h4\u0000\u036e\u036c\u0001\u0000\u0000"
          + "\u0000\u036f\u0372\u0001\u0000\u0000\u0000\u0370\u036e\u0001\u0000\u0000"
          + "\u0000\u0370\u0371\u0001\u0000\u0000\u0000\u0371\u0374\u0001\u0000\u0000"
          + "\u0000\u0372\u0370\u0001\u0000\u0000\u0000\u0373\u0375\u0005\r\u0000\u0000"
          + "\u0374\u0373\u0001\u0000\u0000\u0000\u0374\u0375\u0001\u0000\u0000\u0000"
          + "\u0375\u0377\u0001\u0000\u0000\u0000\u0376\u036b\u0001\u0000\u0000\u0000"
          + "\u0376\u0377\u0001\u0000\u0000\u0000\u0377\u0378\u0001\u0000\u0000\u0000"
          + "\u0378\u0379\u0005\u000b\u0000\u0000\u0379w\u0001\u0000\u0000\u0000\u037a"
          + "\u0390\u0003N\'\u0000\u037b\u037d\u0005k\u0000\u0000\u037c\u037b\u0001"
          + "\u0000\u0000\u0000\u037c\u037d\u0001\u0000\u0000\u0000\u037d\u037e\u0001"
          + "\u0000\u0000\u0000\u037e\u0380\u0005Y\u0000\u0000\u037f\u0381\u0005\u001a"
          + "\u0000\u0000\u0380\u037f\u0001\u0000\u0000\u0000\u0380\u0381\u0001\u0000"
          + "\u0000\u0000\u0381\u0382\u0001\u0000\u0000\u0000\u0382\u0384\u0005\u0007"
          + "\u0000\u0000\u0383\u0385\u0003X,\u0000\u0384\u0383\u0001\u0000\u0000\u0000"
          + "\u0384\u0385\u0001\u0000\u0000\u0000\u0385\u0386\u0001\u0000\u0000\u0000"
          + "\u0386\u0387\u0005\b\u0000\u0000\u0387\u0390\u0003^/\u0000\u0388\u038a"
          + "\u0005k\u0000\u0000\u0389\u0388\u0001\u0000\u0000\u0000\u0389\u038a\u0001"
          + "\u0000\u0000\u0000\u038a\u038b\u0001\u0000\u0000\u0000\u038b\u038c\u0003"
          + "z=\u0000\u038c\u038d\u0005<\u0000\u0000\u038d\u038e\u0003|>\u0000\u038e"
          + "\u0390\u0001\u0000\u0000\u0000\u038f\u037a\u0001\u0000\u0000\u0000\u038f"
          + "\u037c\u0001\u0000\u0000\u0000\u038f\u0389\u0001\u0000\u0000\u0000\u0390"
          + "y\u0001\u0000\u0000\u0000\u0391\u0398\u0003\u0090H\u0000\u0392\u0394\u0005"
          + "\u0007\u0000\u0000\u0393\u0395\u0003X,\u0000\u0394\u0393\u0001\u0000\u0000"
          + "\u0000\u0394\u0395\u0001\u0000\u0000\u0000\u0395\u0396\u0001\u0000\u0000"
          + "\u0000\u0396\u0398\u0005\b\u0000\u0000\u0397\u0391\u0001\u0000\u0000\u0000"
          + "\u0397\u0392\u0001\u0000\u0000\u0000\u0398{\u0001\u0000\u0000\u0000\u0399"
          + "\u039c\u0003r9\u0000\u039a\u039c\u0003^/\u0000\u039b\u0399\u0001\u0000"
          + "\u0000\u0000\u039b\u039a\u0001\u0000\u0000\u0000\u039c}\u0001\u0000\u0000"
          + "\u0000\u039d\u039e\u0007\u0005\u0000\u0000\u039e\u007f\u0001\u0000\u0000"
          + "\u0000\u039f\u03a7\u0005=\u0000\u0000\u03a0\u03a7\u0005>\u0000\u0000\u03a1"
          + "\u03a7\u0005x\u0000\u0000\u03a2\u03a7\u0003\u0082A\u0000\u03a3\u03a7\u0005"
          + "\u0004\u0000\u0000\u03a4\u03a7\u0003\u0086C\u0000\u03a5\u03a7\u0003\u0088"
          + "D\u0000\u03a6\u039f\u0001\u0000\u0000\u0000\u03a6\u03a0\u0001\u0000\u0000"
          + "\u0000\u03a6\u03a1\u0001\u0000\u0000\u0000\u03a6\u03a2\u0001\u0000\u0000"
          + "\u0000\u03a6\u03a3\u0001\u0000\u0000\u0000\u03a6\u03a4\u0001\u0000\u0000"
          + "\u0000\u03a6\u03a5\u0001\u0000\u0000\u0000\u03a7\u0081\u0001\u0000\u0000"
          + "\u0000\u03a8\u03ac\u0005y\u0000\u0000\u03a9\u03ab\u0003\u0084B\u0000\u03aa"
          + "\u03a9\u0001\u0000\u0000\u0000\u03ab\u03ae\u0001\u0000\u0000\u0000\u03ac"
          + "\u03aa\u0001\u0000\u0000\u0000\u03ac\u03ad\u0001\u0000\u0000\u0000\u03ad"
          + "\u03af\u0001\u0000\u0000\u0000\u03ae\u03ac\u0001\u0000\u0000\u0000\u03af"
          + "\u03b0\u0005y\u0000\u0000\u03b0\u0083\u0001\u0000\u0000\u0000\u03b1\u03b7"
          + "\u0005\u0080\u0000\u0000\u03b2\u03b3\u0005\u007f\u0000\u0000\u03b3\u03b4"
          + "\u0003r9\u0000\u03b4\u03b5\u0005\n\u0000\u0000\u03b5\u03b7\u0001\u0000"
          + "\u0000\u0000\u03b6\u03b1\u0001\u0000\u0000\u0000\u03b6\u03b2\u0001\u0000"
          + "\u0000\u0000\u03b7\u0085\u0001\u0000\u0000\u0000\u03b8\u03b9\u0007\u0006"
          + "\u0000\u0000\u03b9\u0087\u0001\u0000\u0000\u0000\u03ba\u03bb\u0007\u0007"
          + "\u0000\u0000\u03bb\u0089\u0001\u0000\u0000\u0000\u03bc\u03bd\u0004E\""
          + "\u0000\u03bd\u03be\u0003\u0090H\u0000\u03be\u03bf\u0003j5\u0000\u03bf"
          + "\u008b\u0001\u0000\u0000\u0000\u03c0\u03c1\u0004F#\u0000\u03c1\u03c2\u0003"
          + "\u0090H\u0000\u03c2\u03c3\u0003j5\u0000\u03c3\u008d\u0001\u0000\u0000"
          + "\u0000\u03c4\u03c7\u0003\u0090H\u0000\u03c5\u03c7\u0003\u0092I\u0000\u03c6"
          + "\u03c4\u0001\u0000\u0000\u0000\u03c6\u03c5\u0001\u0000\u0000\u0000\u03c7"
          + "\u008f\u0001\u0000\u0000\u0000\u03c8\u03c9\u0007\b\u0000\u0000\u03c9\u0091"
          + "\u0001\u0000\u0000\u0000\u03ca\u03ce\u0003\u0094J\u0000\u03cb\u03ce\u0005"
          + "=\u0000\u0000\u03cc\u03ce\u0005>\u0000\u0000\u03cd\u03ca\u0001\u0000\u0000"
          + "\u0000\u03cd\u03cb\u0001\u0000\u0000\u0000\u03cd\u03cc\u0001\u0000\u0000"
          + "\u0000\u03ce\u0093\u0001\u0000\u0000\u0000\u03cf\u03fe\u0005H\u0000\u0000"
          + "\u03d0\u03fe\u0005I\u0000\u0000\u03d1\u03fe\u0005J\u0000\u0000\u03d2\u03fe"
          + "\u0005K\u0000\u0000\u03d3\u03fe\u0005L\u0000\u0000\u03d4\u03fe\u0005M"
          + "\u0000\u0000\u03d5\u03fe\u0005N\u0000\u0000\u03d6\u03fe\u0005O\u0000\u0000"
          + "\u03d7\u03fe\u0005P\u0000\u0000\u03d8\u03fe\u0005Q\u0000\u0000\u03d9\u03fe"
          + "\u0005R\u0000\u0000\u03da\u03fe\u0005S\u0000\u0000\u03db\u03fe\u0005T"
          + "\u0000\u0000\u03dc\u03fe\u0005U\u0000\u0000\u03dd\u03fe\u0005V\u0000\u0000"
          + "\u03de\u03fe\u0005W\u0000\u0000\u03df\u03fe\u0005X\u0000\u0000\u03e0\u03fe"
          + "\u0005Y\u0000\u0000\u03e1\u03fe\u0005Z\u0000\u0000\u03e2\u03fe\u0005["
          + "\u0000\u0000\u03e3\u03fe\u0005\\\u0000\u0000\u03e4\u03fe\u0005]\u0000"
          + "\u0000\u03e5\u03fe\u0005^\u0000\u0000\u03e6\u03fe\u0005_\u0000\u0000\u03e7"
          + "\u03fe\u0005`\u0000\u0000\u03e8\u03fe\u0005a\u0000\u0000\u03e9\u03fe\u0005"
          + "d\u0000\u0000\u03ea\u03fe\u0005e\u0000\u0000\u03eb\u03fe\u0005f\u0000"
          + "\u0000\u03ec\u03fe\u0005g\u0000\u0000\u03ed\u03fe\u0005h\u0000\u0000\u03ee"
          + "\u03fe\u0005i\u0000\u0000\u03ef\u03fe\u0005j\u0000\u0000\u03f0\u03fe\u0005"
          + "n\u0000\u0000\u03f1\u03fe\u0003\u0096K\u0000\u03f2\u03fe\u0005q\u0000"
          + "\u0000\u03f3\u03fe\u0005r\u0000\u0000\u03f4\u03fe\u0005s\u0000\u0000\u03f5"
          + "\u03fe\u0005t\u0000\u0000\u03f6\u03fe\u0005u\u0000\u0000\u03f7\u03fe\u0005"
          + "v\u0000\u0000\u03f8\u03fe\u0005m\u0000\u0000\u03f9\u03fe\u0005k\u0000"
          + "\u0000\u03fa\u03fe\u0005l\u0000\u0000\u03fb\u03fe\u0005c\u0000\u0000\u03fc"
          + "\u03fe\u0005b\u0000\u0000\u03fd\u03cf\u0001\u0000\u0000\u0000\u03fd\u03d0"
          + "\u0001\u0000\u0000\u0000\u03fd\u03d1\u0001\u0000\u0000\u0000\u03fd\u03d2"
          + "\u0001\u0000\u0000\u0000\u03fd\u03d3\u0001\u0000\u0000\u0000\u03fd\u03d4"
          + "\u0001\u0000\u0000\u0000\u03fd\u03d5\u0001\u0000\u0000\u0000\u03fd\u03d6"
          + "\u0001\u0000\u0000\u0000\u03fd\u03d7\u0001\u0000\u0000\u0000\u03fd\u03d8"
          + "\u0001\u0000\u0000\u0000\u03fd\u03d9\u0001\u0000\u0000\u0000\u03fd\u03da"
          + "\u0001\u0000\u0000\u0000\u03fd\u03db\u0001\u0000\u0000\u0000\u03fd\u03dc"
          + "\u0001\u0000\u0000\u0000\u03fd\u03dd\u0001\u0000\u0000\u0000\u03fd\u03de"
          + "\u0001\u0000\u0000\u0000\u03fd\u03df\u0001\u0000\u0000\u0000\u03fd\u03e0"
          + "\u0001\u0000\u0000\u0000\u03fd\u03e1\u0001\u0000\u0000\u0000\u03fd\u03e2"
          + "\u0001\u0000\u0000\u0000\u03fd\u03e3\u0001\u0000\u0000\u0000\u03fd\u03e4"
          + "\u0001\u0000\u0000\u0000\u03fd\u03e5\u0001\u0000\u0000\u0000\u03fd\u03e6"
          + "\u0001\u0000\u0000\u0000\u03fd\u03e7\u0001\u0000\u0000\u0000\u03fd\u03e8"
          + "\u0001\u0000\u0000\u0000\u03fd\u03e9\u0001\u0000\u0000\u0000\u03fd\u03ea"
          + "\u0001\u0000\u0000\u0000\u03fd\u03eb\u0001\u0000\u0000\u0000\u03fd\u03ec"
          + "\u0001\u0000\u0000\u0000\u03fd\u03ed\u0001\u0000\u0000\u0000\u03fd\u03ee"
          + "\u0001\u0000\u0000\u0000\u03fd\u03ef\u0001\u0000\u0000\u0000\u03fd\u03f0"
          + "\u0001\u0000\u0000\u0000\u03fd\u03f1\u0001\u0000\u0000\u0000\u03fd\u03f2"
          + "\u0001\u0000\u0000\u0000\u03fd\u03f3\u0001\u0000\u0000\u0000\u03fd\u03f4"
          + "\u0001\u0000\u0000\u0000\u03fd\u03f5\u0001\u0000\u0000\u0000\u03fd\u03f6"
          + "\u0001\u0000\u0000\u0000\u03fd\u03f7\u0001\u0000\u0000\u0000\u03fd\u03f8"
          + "\u0001\u0000\u0000\u0000\u03fd\u03f9\u0001\u0000\u0000\u0000\u03fd\u03fa"
          + "\u0001\u0000\u0000\u0000\u03fd\u03fb\u0001\u0000\u0000\u0000\u03fd\u03fc"
          + "\u0001\u0000\u0000\u0000\u03fe\u0095\u0001\u0000\u0000\u0000\u03ff\u0400"
          + "\u0007\t\u0000\u0000\u0400\u0097\u0001\u0000\u0000\u0000\u0401\u0406\u0005"
          + "\f\u0000\u0000\u0402\u0406\u0005\u0000\u0000\u0001\u0403\u0406\u0004L"
          + "$\u0000\u0404\u0406\u0004L%\u0000\u0405\u0401\u0001\u0000\u0000\u0000"
          + "\u0405\u0402\u0001\u0000\u0000\u0000\u0405\u0403\u0001\u0000\u0000\u0000"
          + "\u0405\u0404\u0001\u0000\u0000\u0000\u0406\u0099\u0001\u0000\u0000\u0000"
          + "p\u009b\u00b5\u00b9\u00c0\u00c6\u00ca\u00d1\u00d9\u00de\u00e0\u00e9\u00ed"
          + "\u00f5\u00fa\u0103\u010b\u010f\u0114\u011f\u0125\u0134\u0148\u014c\u0150"
          + "\u0158\u0161\u0166\u016e\u0173\u0178\u017f\u0186\u018d\u019f\u01a3\u01a5"
          + "\u01ac\u01b2\u01b7\u01c6\u01c9\u01ce\u01d1\u01dc\u01e0\u01e5\u01f0\u01f6"
          + "\u01ff\u0201\u020a\u020e\u0214\u0217\u021a\u021f\u0225\u0228\u0230\u0233"
          + "\u0238\u023d\u0244\u0249\u024c\u0251\u0258\u025f\u0268\u026c\u0271\u0276"
          + "\u027c\u0280\u028f\u0292\u0297\u02a8\u02ab\u02b4\u02bc\u02c0\u02c2\u02c7"
          + "\u02cb\u02d2\u02d9\u0309\u0347\u034f\u0353\u0360\u0362\u0368\u0370\u0374"
          + "\u0376\u037c\u0380\u0384\u0389\u038f\u0394\u0397\u039b\u03a6\u03ac\u03b6"
          + "\u03c6\u03cd\u03fd\u0405";
  public static final ATN _ATN = new ATNDeserializer().deserialize(_serializedATN.toCharArray());

  static {
    _decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
    for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
      _decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
    }
  }
}
