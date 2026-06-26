package ru.yandex.practicum.contacts.presentation.sort;

class SortUiState {

    private boolean applyEnable = false;
    private String newSelectedSortType = null;

    public boolean isApplyEnable() {
        return applyEnable;
    }

    public void setApplyEnable(boolean applyEnable) {
        this.applyEnable = applyEnable;
    }

    public String getNewSelectedSortType() {
        return newSelectedSortType;
    }

    public void setNewSelectedSortType(String newSelectedSortType) {
        this.newSelectedSortType = newSelectedSortType;
    }

}
