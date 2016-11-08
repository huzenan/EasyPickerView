# EasyPickerView
A light PickerView for Android.

## ScreenShots
![picker](https://github.com/huzenan/EasyPickerView/blob/master/screenshots/picker.gif) 
![scale](https://github.com/huzenan/EasyPickerView/blob/master/screenshots/scale.gif)

## Usage
>layout

```xml
    <com.hzn.easypickerview.EasyPickerView
        android:id="@+id/cpv"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:paddingLeft="15dp"
        android:paddingRight="15dp"
        custom:epvRecycleMode="true"
        custom:epvTextColor="#4aa4a4"
        custom:epvTextMaxScale="2.0"
        custom:epvTextMinAlpha="0.35"
        custom:epvTextPadding="10dp"
        custom:epvTextSize="30sp"/>
```
>Activity

```java
    cpv.setDataList(dataList);
    cpv.setOnScrollChangedListener(new EasyPickerView.OnScrollChangedListener() {
        @Override
        public void onScrollChanged(int curIndex) {
            // your codes.
        }

        @Override
        public void onScrollFinished(int curIndex) {
            // your codes.
        }
    });
```
