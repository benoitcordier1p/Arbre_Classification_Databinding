// Generated by Dagger (https://dagger.dev).
package com.example.presentation_databinding.presentation.treeList;

import com.example.domain.useCase.treesListUseCase.GetTreesUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class TreesListViewModel_Factory implements Factory<TreesListViewModel> {
  private final Provider<GetTreesUseCase> getTreesUseCaseProvider;

  public TreesListViewModel_Factory(Provider<GetTreesUseCase> getTreesUseCaseProvider) {
    this.getTreesUseCaseProvider = getTreesUseCaseProvider;
  }

  @Override
  public TreesListViewModel get() {
    return newInstance(getTreesUseCaseProvider.get());
  }

  public static TreesListViewModel_Factory create(
      Provider<GetTreesUseCase> getTreesUseCaseProvider) {
    return new TreesListViewModel_Factory(getTreesUseCaseProvider);
  }

  public static TreesListViewModel newInstance(GetTreesUseCase getTreesUseCase) {
    return new TreesListViewModel(getTreesUseCase);
  }
}
