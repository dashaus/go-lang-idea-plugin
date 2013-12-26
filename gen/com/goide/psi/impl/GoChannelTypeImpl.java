// This is a generated file. Not intended for manual editing.
package com.goide.psi.impl;

import com.goide.psi.GoChannelType;
import com.goide.psi.GoElementType;
import com.goide.psi.GoVisitor;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.jetbrains.annotations.NotNull;

import static com.goide.GoTypes.CHAN;

public class GoChannelTypeImpl extends GoCompositeElementImpl implements GoChannelType {

  public GoChannelTypeImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof GoVisitor) ((GoVisitor)visitor).visitChannelType(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public GoElementType getElementType() {
    return findNotNullChildByClass(GoElementType.class);
  }

  @Override
  @NotNull
  public PsiElement getChan() {
    return findNotNullChildByType(CHAN);
  }

}