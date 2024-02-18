package com.github.simplesteph.protobuf;

import android.car.cluster.navigation.NavigationState;

public class NavigateMain {

    private NavigationState.NavigationStateProto[] getNavStateData() {
        NavigationState.NavigationStateProto[] navigationStateArray = new NavigationState.NavigationStateProto[1];

        navigationStateArray[0] = NavigationState.NavigationStateProto.newBuilder()
                .addSteps(NavigationState.Step.newBuilder()
                        .setManeuver(NavigationState.Maneuver.newBuilder()
                                .setType(NavigationState.Maneuver.Type.DEPART)
                                .build())
                        .setDistance(NavigationState.Distance.newBuilder()
                                .setMeters(300)
                                .setDisplayUnits(NavigationState.Distance.Unit.FEET)
                                .setDisplayValue("0.5")
                                .build())
                        .setCue(NavigationState.Cue.newBuilder()
                                .addElements(NavigationState.Cue.CueElement.newBuilder()
                                        .setText("Stay on ")
                                        .build())
                                .addElements(NavigationState.Cue.CueElement.newBuilder()
                                        .setText("US 101 ")
                                        .setImage(NavigationState.ImageReference.newBuilder()
                                                .setAspectRatio(1.153846)
                                                .setContentUri(
                                                        "content://com.google.android.car"
                                                                + ".kitchensink.cluster"
                                                                + ".clustercontentprovider/img"
                                                                + "/US_101.png")
                                                .build())
                                        .build())
                                .build())
                        .addLanes(NavigationState.Lane.newBuilder()
                                .addLaneDirections(NavigationState.Lane.LaneDirection.newBuilder()
                                        .setShape(NavigationState.Lane.LaneDirection.Shape.SLIGHT_LEFT)
                                        .setIsHighlighted(false)
                                        .build())
                                .addLaneDirections(NavigationState.Lane.LaneDirection.newBuilder()
                                        .setShape(NavigationState.Lane.LaneDirection.Shape.STRAIGHT)
                                        .setIsHighlighted(true)
                                        .build())
                                .build())
                        .build())
                .setCurrentRoad(NavigationState.Road.newBuilder()
                        .setName("On something really long st")
                        .build())
                .addDestinations(NavigationState.Destination.newBuilder()
                        .setTitle("Home")
                        .setAddress("123 Main st")
                        .setDistance(NavigationState.Distance.newBuilder()
                                .setMeters(2000)
                                .setDisplayValue("2")
                                .setDisplayUnits(NavigationState.Distance.Unit.KILOMETERS)
                                .build())
                        .setEstimatedTimeAtArrival(NavigationState.Timestamp.newBuilder()
                                .setSeconds(1592610807)
                                .build())
                        .setFormattedDurationUntilArrival("45 min")
                        .setZoneId("America/Los_Angeles")
                        .setTraffic(NavigationState.Destination.Traffic.HIGH)
                        .build())
                .build();

        return navigationStateArray;
    }

}
