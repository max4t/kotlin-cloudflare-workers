// Automatically generated - do not modify!

package cloudflare.workers.types.index

external interface ImageTransform {
    var width: Double?
    var height: Double?
    var background: String?
    var blur: Double?
    var border:
        (
            Any /* {
    color?: string;
    width?: number;
} | {
    top?: number;
    bottom?: number;
    left?: number;
    right?: number;
} */
        )?
    var brightness: Double?
    var contrast: Double?
    var fit: (ImageTransformFit)?
    var flip: (ImageTransformFlip)?
    var gamma: Double?
    var segment: String /* "foreground" */?
    var gravity:
        (
            Any /* "face" | "left" | "right" | "top" | "bottom" | "center" | "auto" | "entropy" | {
    x?: number;
    y?: number;
    mode: "remainder" | "box-center";
} */
        )?
    var rotate: (ImageTransformRotate)?
    var saturation: Double?
    var sharpen: Double?
    var trim:
        (
            Any /* "border" | {
    top?: number;
    bottom?: number;
    left?: number;
    right?: number;
    width?: number;
    height?: number;
    border?: boolean | {
        color?: string;
        tolerance?: number;
        keep?: number;
    };
} */
        )?
}
