//package com.uber.api.services;
//
//import com.uber.api.models.Driver;
//import com.uber.api.models.Location;
//import com.uber.api.repositories.DriverRepository;
//import com.uber.api.utils.QuadTree;
//import lombok.AllArgsConstructor;
//
//import java.util.*;
//import java.util.stream.Collectors;
//
//// Quad-Tree
//// splits your 2-d plane into quadrants
////
////class QTNode {
////    long key;
////    int x, y;
////    long count;
////    QTNode ne = null, nw = null, se= null, sw = null;
////
////    public QTNode(Point topleft, Point bottomRight) {
////        this.key = key;
////        count = 0;
////    }
////
////    public void add(int x, int y) {
////        if(count == 0) {
////            this.x = x;
////            this.y = y;
////        }
////        else if(count == 1) {
////            ne = new QTNode()
////        }
////    }
////}
////
////class com.uber.api.utils.QuadTree {
////
////}
//
//@AllArgsConstructor
//class Point {
//    long x, y;
//    public static Point fromLocation(Location location) {
//        return new Point(0, 0);
//    }
//}
//
//public class TrackingService {
//    DriverRepository driverRepository;
//
//    QuadTree quadTree = new QuadTree(new QuadTree.Rect(0, 0, 100, 100));
//    Map<Point, Set<Long>> driversForLocation;
//
//    public void updateDriverLocation(Driver driver, Location location) {
//        // remove the previous location from the quadTree
//        // add the current position
//        Point p = Point.fromLocation(location);
//        quadTree.add(p.x, p.y);
//        driversForLocation.getOrDefault(p, new HashSet<>()).add(driver.getId());
//    }
//
//    public List<Driver> getNearbyDrivers(Location location) {
//        Point p = Point.fromLocation(location);
//        List<Long> driverIds = new ArrayList<>();
//        for(QuadTree.Pt point: quadTree.kNearestNeighbors(10, p.x, p.y)) {
//            driverIds.addAll(driversForLocation.get(new Point(point.x, point.y)))
//        }
//        return driverIds
//                .stream()
//                .map(x -> driverRepository.findById(x).get())
//                .collect(Collectors.toList());
//    }
//}
