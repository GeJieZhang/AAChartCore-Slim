//
//  AASeriesElement.java
//  ChartCore-Slim
//
//  Created by anan on 2018/4/16..
//  Copyright © 2018年 An An. All rights reserved.
//*************** ...... SOURCE CODE ...... ***************
//***...................................................***
//*** https://github.com/AAChartModel/ChartCore         ***
//*** https://github.com/AAChartModel/ChartCore-Slim    ***
//***...................................................***
//*************** ...... SOURCE CODE ...... ***************


 /*

 * -------------------------------------------------------------------------------
 *
 *  🌕 🌖 🌗 🌘  ❀❀❀   WARM TIPS!!!   ❀❀❀ 🌑 🌒 🌓 🌔
 *
 * Please contact me on GitHub,if there are any problems encountered in use.
 * GitHub Issues : https://github.com/AAChartModel/ChartCore-Slim/issues
 * -------------------------------------------------------------------------------
 * And if you want to contribute for this project, please contact me as well
 * GitHub        : https://github.com/AAChartModel
 * StackOverflow : https://stackoverflow.com/users/7842508/codeforu
 * JianShu       : http://www.jianshu.com/u/f1e6753d4254
 * SegmentFault  : https://segmentfault.com/u/huanghunbieguan
 *
 * -------------------------------------------------------------------------------

 */

package com.example.anan.chartcore_slim.AAChartConfiger;

import java.util.Dictionary;

/**
 * Created by anan on 2018/4/16.
 */

public class AASeriesElement {

    private String type;
    private String name;
    private Object[] data;
    private Float lineWidth;//折线图、曲线图、直方折线图、折线填充图、曲线填充图、直方折线填充图的线条宽度
    private Object color;
    private Float fillOpacity;//折线填充图、曲线填充图、直方折线填充图等填充图类型的填充颜色透明度
    private Float threshold;//The threshold, also called zero level or base level. For line type series this is only used in conjunction with negativeColor. default：0.
    private String negativeColor;// The color for the parts of the graph or points that are below the threshold
    private String dashStyle;
    private Dictionary dataLabels;
    private Dictionary marker;
    private Object step;
    private Boolean colorByPoint;
    private Integer zIndex;


    public AASeriesElement type(String type) {
        this.type = type;
        return this;
    }

    public AASeriesElement name(String name) {
        this.name = name;
        return this;
    }

    public AASeriesElement data(Object[] data) {
        this.data = data;
        return this;
    }

    public AASeriesElement lineWidth(Float lineWidth) {
        this.lineWidth = lineWidth;
        return this;
    }

    public AASeriesElement  color(Object color) {
        this.color = color;
        return this;
    }

    public AASeriesElement fillOpacity(Float fillOpacity) {
        this.fillOpacity = fillOpacity;
        return this;
    }

    public AASeriesElement threshold(Float threshold) {
        this.threshold = threshold;
        return this;
    }

    public AASeriesElement negativeColor(String negativeColor) {
        this.negativeColor = negativeColor;
        return this;
    }

    public AASeriesElement dashStyle(String dashStyle) {
        this.dashStyle = dashStyle;
        return this;
    }

    public AASeriesElement dataLabels(Dictionary dataLabels) {
        this.dataLabels = dataLabels;
        return this;
    }

    public AASeriesElement marker(Dictionary marker) {
        this.marker = marker;
        return this;
    }

    public AASeriesElement step(Object step) {
        this.step = step;
        return this;
    }

    public AASeriesElement colorByPoint(Boolean colorByPoint) {
        this.colorByPoint = colorByPoint;
        return this;
    }

    public AASeriesElement zIndex(Integer zIndex) {
        this.zIndex = zIndex;
        return this;
    }



}
