// This is a generated file. Not intended for manual editing.
package se.ch.HAnS.featureToFolder.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static se.ch.HAnS.featureToFolder.psi.FeatureToFolderTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class FeatureToFolderParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return featureToFolderFile(b, l + 1);
  }

  /* ********************************************************** */
  // ' '* lpq (' '* ','* ' '* lpq)* CRLF*
  static boolean featureToFolderFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "featureToFolderFile")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = featureToFolderFile_0(b, l + 1);
    r = r && lpq(b, l + 1);
    r = r && featureToFolderFile_2(b, l + 1);
    r = r && featureToFolderFile_3(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ' '*
  private static boolean featureToFolderFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "featureToFolderFile_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "featureToFolderFile_0", c)) break;
    }
    return true;
  }

  // (' '* ','* ' '* lpq)*
  private static boolean featureToFolderFile_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "featureToFolderFile_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!featureToFolderFile_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "featureToFolderFile_2", c)) break;
    }
    return true;
  }

  // ' '* ','* ' '* lpq
  private static boolean featureToFolderFile_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "featureToFolderFile_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = featureToFolderFile_2_0_0(b, l + 1);
    r = r && featureToFolderFile_2_0_1(b, l + 1);
    r = r && featureToFolderFile_2_0_2(b, l + 1);
    r = r && lpq(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // ' '*
  private static boolean featureToFolderFile_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "featureToFolderFile_2_0_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "featureToFolderFile_2_0_0", c)) break;
    }
    return true;
  }

  // ','*
  private static boolean featureToFolderFile_2_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "featureToFolderFile_2_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, ",")) break;
      if (!empty_element_parsed_guard_(b, "featureToFolderFile_2_0_1", c)) break;
    }
    return true;
  }

  // ' '*
  private static boolean featureToFolderFile_2_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "featureToFolderFile_2_0_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, " ")) break;
      if (!empty_element_parsed_guard_(b, "featureToFolderFile_2_0_2", c)) break;
    }
    return true;
  }

  // CRLF*
  private static boolean featureToFolderFile_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "featureToFolderFile_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, CRLF)) break;
      if (!empty_element_parsed_guard_(b, "featureToFolderFile_3", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // FEATURENAME ('::'FEATURENAME)*
  public static boolean lpq(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lpq")) return false;
    if (!nextTokenIs(b, FEATURENAME)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, FEATURENAME);
    r = r && lpq_1(b, l + 1);
    exit_section_(b, m, LPQ, r);
    return r;
  }

  // ('::'FEATURENAME)*
  private static boolean lpq_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lpq_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!lpq_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "lpq_1", c)) break;
    }
    return true;
  }

  // '::'FEATURENAME
  private static boolean lpq_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "lpq_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "::");
    r = r && consumeToken(b, FEATURENAME);
    exit_section_(b, m, null, r);
    return r;
  }

}
