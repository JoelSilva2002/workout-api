package br.com.meutreino.workout_api;


import br.com.meutreino.workout_api.repository.ExerciseRepository;
import br.com.meutreino.workout_api.model.Exercise;
import br.com.meutreino.workout_api.model.PlannedExercise;
import br.com.meutreino.workout_api.model.PlannedSet;
import br.com.meutreino.workout_api.model.WorkoutPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import br.com.meutreino.workout_api.repository.WorkoutPlanRepository;


import java.util.*;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired private ExerciseRepository exerciseRepository;
    @Autowired private WorkoutPlanRepository workoutPlanRepository;

    @Override
    public void run(String... args) throws Exception {
        // Só carrega os dados se o banco estiver vazio
        if (workoutPlanRepository.count() == 0) {
            System.out.println(">>> Carregando dados iniciais...");

            Exercise elevacaoLateral = new Exercise();
            elevacaoLateral.setName("Elevação Lateral Halter");
            exerciseRepository.save(elevacaoLateral);

            Exercise supinoInclinado = new Exercise();
            supinoInclinado.setName("Supino inclinado articulado");
            exerciseRepository.save(supinoInclinado);

            Exercise puxadaAltaUni = new Exercise();
            puxadaAltaUni.setName("Puxada alta Uni.");
            exerciseRepository.save(puxadaAltaUni);

            Exercise elevacaoFrontalPolia = new Exercise();
            elevacaoFrontalPolia.setName("Elevação Frontal Uni Polia");
            exerciseRepository.save(elevacaoFrontalPolia);

            Exercise roscaDiretaPoliaAtras = new Exercise();
            roscaDiretaPoliaAtras.setName("Rosca Direta Polia (atrás)");
            exerciseRepository.save(roscaDiretaPoliaAtras);

            Exercise tricepsCarter = new Exercise();
            tricepsCarter.setName("Tríceps Carter");
            exerciseRepository.save(tricepsCarter);

            Exercise facePull = new Exercise();
            facePull.setName("Face Pull");
            exerciseRepository.save(facePull);

            Exercise panturrilhaSmith = new Exercise();
            panturrilhaSmith.setName("Panturrilha Smith");
            exerciseRepository.save(panturrilhaSmith);

            Exercise agachamentoArticulado = new Exercise();
            agachamentoArticulado.setName("Agachamento Articulado");
            exerciseRepository.save(agachamentoArticulado);

            Exercise rdl = new Exercise();
            rdl.setName("RDL");
            exerciseRepository.save(rdl);

            Exercise cadeiraAdutora = new Exercise();
            cadeiraAdutora.setName("Cadeira Adutora");
            exerciseRepository.save(cadeiraAdutora);

            Exercise cadeiraExtensora = new Exercise();
            cadeiraExtensora.setName("Cadeira Extensora");
            exerciseRepository.save(cadeiraExtensora);

            Exercise cadeiraFlexora = new Exercise();
            cadeiraFlexora.setName("Cadeira Flexora");
            exerciseRepository.save(cadeiraFlexora);

            Exercise pullDown = new Exercise();
            pullDown.setName("Pull Down");
            exerciseRepository.save(pullDown);

            Exercise remadaAltaHalterUni = new Exercise();
            remadaAltaHalterUni.setName("Remada Alta Halter Uni.");
            exerciseRepository.save(remadaAltaHalterUni);

            Exercise crucifixoMaquina = new Exercise();
            crucifixoMaquina.setName("Crucifixo Máquina");
            exerciseRepository.save(crucifixoMaquina);

            Exercise puxadaAltaAberta = new Exercise();
            puxadaAltaAberta.setName("Puxada Alta Aberta");
            exerciseRepository.save(puxadaAltaAberta);

            Exercise pushDownAjoelhado = new Exercise();
            pushDownAjoelhado.setName("Push Down Ajoelhado");
            exerciseRepository.save(pushDownAjoelhado);

            Exercise roscaMarteloHalter = new Exercise();
            roscaMarteloHalter.setName("Rosca Martelo Halter");
            exerciseRepository.save(roscaMarteloHalter);

            Exercise abdominalArticulado = new Exercise();
            abdominalArticulado.setName("Abdominal Articulado");
            exerciseRepository.save(abdominalArticulado);

            Exercise panturrilhaLeg180 = new Exercise();
            panturrilhaLeg180.setName("Panturrilha Leg 180°");
            exerciseRepository.save(panturrilhaLeg180);

            Exercise agachamentoSmith = new Exercise();
            agachamentoSmith.setName("Agachamento Smith");
            exerciseRepository.save(agachamentoSmith);

            Exercise cadeiraAbdutora = new Exercise();
            cadeiraAbdutora.setName("Cadeira Abdutora");
            exerciseRepository.save(cadeiraAbdutora);

            Exercise flexoraEmPe = new Exercise();
            flexoraEmPe.setName("Flexora em Pé");
            exerciseRepository.save(flexoraEmPe);

            WorkoutPlan planoA = new WorkoutPlan();
            planoA.setName("Treino A (Upper 1)");

            WorkoutPlan planoB = new WorkoutPlan();
            planoB.setName("Treino B (Lower 1)");

            WorkoutPlan planoC = new WorkoutPlan();
            planoC.setName("Treino C (Upper 2)");

            WorkoutPlan planoD = new WorkoutPlan();
            planoD.setName("Treino D (Lower 2)");

            // 1) Elevação Lateral Halter
            PlannedExercise plannedElevacao = new PlannedExercise();
            plannedElevacao.setWorkoutPlan(planoA);
            plannedElevacao.setExercise(elevacaoLateral);
            plannedElevacao.setSequence(1);

            PlannedSet elevacaoSet1 = new PlannedSet();
            elevacaoSet1.setPlannedExercise(plannedElevacao);
            elevacaoSet1.setSetIndex(0);
            elevacaoSet1.setType("Warmup");
            elevacaoSet1.setTargetReps("10 a 12SM");
            elevacaoSet1.setRestTimeSeconds(30);

            PlannedSet elevacaoSet2 = new PlannedSet();
            elevacaoSet2.setPlannedExercise(plannedElevacao);
            elevacaoSet2.setSetIndex(1);
            elevacaoSet2.setType("Feeders");
            elevacaoSet2.setTargetReps("3 a 5SM");
            elevacaoSet2.setRestTimeSeconds(30);

            PlannedSet elevacaoSet3 = new PlannedSet();
            elevacaoSet3.setPlannedExercise(plannedElevacao);
            elevacaoSet3.setSetIndex(2);
            elevacaoSet3.setType("Feeders");
            elevacaoSet3.setTargetReps("3 a 5SM");
            elevacaoSet3.setRestTimeSeconds(30);

            PlannedSet elevacaoSet4 = new PlannedSet();
            elevacaoSet4.setPlannedExercise(plannedElevacao);
            elevacaoSet4.setSetIndex(3);
            elevacaoSet4.setType("Reservas");
            elevacaoSet4.setTargetReps("8-12 (2RIR)");
            elevacaoSet4.setRestTimeSeconds(120);

            PlannedSet elevacaoSet5 = new PlannedSet();
            elevacaoSet5.setPlannedExercise(plannedElevacao);
            elevacaoSet5.setSetIndex(4);
            elevacaoSet5.setType("Maxima");
            elevacaoSet5.setTargetReps("8-12");
            elevacaoSet5.setRestTimeSeconds(120);

            plannedElevacao.setPlannedSets(Arrays.asList(elevacaoSet1, elevacaoSet2, elevacaoSet3, elevacaoSet4, elevacaoSet5));


// 2) Supino Inclinado Articulado
            PlannedExercise plannedSupino = new PlannedExercise();
            plannedSupino.setWorkoutPlan(planoA);
            plannedSupino.setExercise(supinoInclinado);
            plannedSupino.setSequence(2);

            PlannedSet supinoSet1 = new PlannedSet();
            supinoSet1.setPlannedExercise(plannedSupino);
            supinoSet1.setSetIndex(0);
            supinoSet1.setType("Warmup");
            supinoSet1.setTargetReps("10 a 12SM");
            supinoSet1.setRestTimeSeconds(30);

            PlannedSet supinoSet2 = new PlannedSet();
            supinoSet2.setPlannedExercise(plannedSupino);
            supinoSet2.setSetIndex(1);
            supinoSet2.setType("Feeders");
            supinoSet2.setTargetReps("3 a 5SM");
            supinoSet2.setRestTimeSeconds(30);

            PlannedSet supinoSet3 = new PlannedSet();
            supinoSet3.setPlannedExercise(plannedSupino);
            supinoSet3.setSetIndex(2);
            supinoSet3.setType("Feeders");
            supinoSet3.setTargetReps("3 a 5SM");
            supinoSet3.setRestTimeSeconds(30);

            PlannedSet supinoSet4 = new PlannedSet();
            supinoSet4.setPlannedExercise(plannedSupino);
            supinoSet4.setSetIndex(3);
            supinoSet4.setType("Reservas");
            supinoSet4.setTargetReps("8-12 (1RIR)");
            supinoSet4.setRestTimeSeconds(120);

            PlannedSet supinoSet5 = new PlannedSet();
            supinoSet5.setPlannedExercise(plannedSupino);
            supinoSet5.setSetIndex(4);
            supinoSet5.setType("maxima");
            supinoSet5.setTargetReps("8-12");
            supinoSet5.setRestTimeSeconds(120);

            plannedSupino.setPlannedSets(Arrays.asList(supinoSet1, supinoSet2, supinoSet3, supinoSet4, supinoSet5));


// 3) Puxada Alta Unilateral
            PlannedExercise plannedPuxada = new PlannedExercise();
            plannedPuxada.setWorkoutPlan(planoA);
            plannedPuxada.setExercise(puxadaAltaUni);
            plannedPuxada.setSequence(3);

            PlannedSet puxadaSet1 = new PlannedSet();
            puxadaSet1.setPlannedExercise(plannedPuxada);
            puxadaSet1.setSetIndex(0);
            puxadaSet1.setType("Warmup");
            puxadaSet1.setTargetReps("10 a 12SM");
            puxadaSet1.setRestTimeSeconds(30);

            PlannedSet puxadaSet2 = new PlannedSet();
            puxadaSet2.setPlannedExercise(plannedPuxada);
            puxadaSet2.setSetIndex(1);
            puxadaSet2.setType("Feeders");
            puxadaSet2.setTargetReps("3 a 5SM");
            puxadaSet2.setRestTimeSeconds(30);

            PlannedSet puxadaSet3 = new PlannedSet();
            puxadaSet3.setPlannedExercise(plannedPuxada);
            puxadaSet3.setSetIndex(2);
            puxadaSet3.setType("Feeders");
            puxadaSet3.setTargetReps("3 a 5SM");
            puxadaSet3.setRestTimeSeconds(30);

            PlannedSet puxadaSet4 = new PlannedSet();
            puxadaSet4.setPlannedExercise(plannedPuxada);
            puxadaSet4.setSetIndex(3);
            puxadaSet4.setType("Reservas");
            puxadaSet4.setTargetReps("8-12 (1RIR)");
            puxadaSet4.setRestTimeSeconds(120);

            PlannedSet puxadaSet5 = new PlannedSet();
            puxadaSet5.setPlannedExercise(plannedPuxada);
            puxadaSet5.setSetIndex(4);
            puxadaSet5.setType("Maximas");
            puxadaSet5.setTargetReps("8-12");
            puxadaSet5.setRestTimeSeconds(120);

            plannedPuxada.setPlannedSets(Arrays.asList(puxadaSet1, puxadaSet2, puxadaSet3, puxadaSet4, puxadaSet5));


// 4) Elevação Frontal Uni Polia
            PlannedExercise plannedElevacaoFront = new PlannedExercise();
            plannedElevacaoFront.setWorkoutPlan(planoA);
            plannedElevacaoFront.setExercise(elevacaoFrontalPolia);
            plannedElevacaoFront.setSequence(4);

            PlannedSet elevFrontSet1 = new PlannedSet();
            elevFrontSet1.setPlannedExercise(plannedElevacaoFront);
            elevFrontSet1.setSetIndex(0);
            elevFrontSet1.setType("Feeders");
            elevFrontSet1.setTargetReps("3 a 5SM");
            elevFrontSet1.setRestTimeSeconds(30);

            PlannedSet elevFrontSet2 = new PlannedSet();
            elevFrontSet2.setPlannedExercise(plannedElevacaoFront);
            elevFrontSet2.setSetIndex(1);
            elevFrontSet2.setType("Feeders");
            elevFrontSet2.setTargetReps("3 a 5SM");
            elevFrontSet2.setRestTimeSeconds(30);

            PlannedSet elevFrontSet3 = new PlannedSet();
            elevFrontSet3.setPlannedExercise(plannedElevacaoFront);
            elevFrontSet3.setSetIndex(2);
            elevFrontSet3.setType("Reservas");
            elevFrontSet3.setTargetReps("8-12 (1RIR)");
            elevFrontSet3.setRestTimeSeconds(120);

            PlannedSet elevFrontSet4 = new PlannedSet();
            elevFrontSet4.setPlannedExercise(plannedElevacaoFront);
            elevFrontSet4.setSetIndex(3);
            elevFrontSet4.setType("Maxima");
            elevFrontSet4.setTargetReps("8-12");
            elevFrontSet4.setRestTimeSeconds(120);

            plannedElevacaoFront.setPlannedSets(Arrays.asList(elevFrontSet1, elevFrontSet2, elevFrontSet3,elevFrontSet4));


// 5) Rosca Direta Polia (atrás)
            PlannedExercise plannedRoscaDireta = new PlannedExercise();
            plannedRoscaDireta.setWorkoutPlan(planoA);
            plannedRoscaDireta.setExercise(roscaDiretaPoliaAtras);
            plannedRoscaDireta.setSequence(5);

            PlannedSet roscaSet1 = new PlannedSet();
            roscaSet1.setPlannedExercise(plannedRoscaDireta);
            roscaSet1.setSetIndex(0);
            roscaSet1.setType("Feeders");
            roscaSet1.setTargetReps("3 a 5SM");
            roscaSet1.setRestTimeSeconds(30);

            PlannedSet roscaSet2 = new PlannedSet();
            roscaSet2.setPlannedExercise(plannedRoscaDireta);
            roscaSet2.setSetIndex(1);
            roscaSet2.setType("Feeders");
            roscaSet2.setTargetReps("3 a 5SM");
            roscaSet2.setRestTimeSeconds(30);

            PlannedSet roscaSet3 = new PlannedSet();
            roscaSet3.setPlannedExercise(plannedRoscaDireta);
            roscaSet3.setSetIndex(2);
            roscaSet3.setType("Reservas");
            roscaSet3.setTargetReps("6-10 (1RIR)");
            roscaSet3.setRestTimeSeconds(120);

            PlannedSet roscaSet4 = new PlannedSet();
            roscaSet4.setPlannedExercise(plannedRoscaDireta);
            roscaSet4.setSetIndex(3);
            roscaSet4.setType("Maxima");
            roscaSet4.setTargetReps("6-10");
            roscaSet4.setRestTimeSeconds(120);

            plannedRoscaDireta.setPlannedSets(Arrays.asList(roscaSet1, roscaSet2, roscaSet3,roscaSet4));


// 6) Tríceps Carter
            PlannedExercise plannedTriceps = new PlannedExercise();
            plannedTriceps.setWorkoutPlan(planoA);
            plannedTriceps.setExercise(tricepsCarter);
            plannedTriceps.setSequence(6);

            PlannedSet tricepsSet1 = new PlannedSet();
            tricepsSet1.setPlannedExercise(plannedTriceps);
            tricepsSet1.setSetIndex(0);
            tricepsSet1.setType("Feeders");
            tricepsSet1.setTargetReps("3 a 5SM");
            tricepsSet1.setRestTimeSeconds(30);

            PlannedSet tricepsSet2 = new PlannedSet();
            tricepsSet2.setPlannedExercise(plannedTriceps);
            tricepsSet2.setSetIndex(1);
            tricepsSet2.setType("Feeders");
            tricepsSet2.setTargetReps("3 a 5SM");
            tricepsSet2.setRestTimeSeconds(30);

            PlannedSet tricepsSet3 = new PlannedSet();
            tricepsSet3.setPlannedExercise(plannedTriceps);
            tricepsSet3.setSetIndex(2);
            tricepsSet3.setType("Reservas");
            tricepsSet3.setTargetReps("8-12 (1RIR)");
            tricepsSet3.setRestTimeSeconds(120);

            PlannedSet tricepsSet4 = new PlannedSet();
            tricepsSet4.setPlannedExercise(plannedTriceps);
            tricepsSet4.setSetIndex(3);
            tricepsSet4.setType("Maxima");
            tricepsSet4.setTargetReps("8-12");
            tricepsSet4.setRestTimeSeconds(120);

            plannedTriceps.setPlannedSets(Arrays.asList(tricepsSet1, tricepsSet2, tricepsSet3, tricepsSet4));


// 7) Face Pull
            PlannedExercise plannedFacePull = new PlannedExercise();
            plannedFacePull.setWorkoutPlan(planoA);
            plannedFacePull.setExercise(facePull);
            plannedFacePull.setSequence(7);

            PlannedSet facePullSet1 = new PlannedSet();
            facePullSet1.setPlannedExercise(plannedFacePull);
            facePullSet1.setSetIndex(0);
            facePullSet1.setType("Maxima");
            facePullSet1.setTargetReps("8-12");
            facePullSet1.setRestTimeSeconds(120);

            PlannedSet facePullSet2 = new PlannedSet();
            facePullSet2.setPlannedExercise(plannedFacePull);
            facePullSet2.setSetIndex(1);
            facePullSet2.setType("Maxima");
            facePullSet2.setTargetReps("8-12");
            facePullSet2.setRestTimeSeconds(120);

            plannedFacePull.setPlannedSets(Arrays.asList(facePullSet1, facePullSet2));


// Associar todos no plano A
            planoA.setPlannedExercises(Arrays.asList(
                    plannedElevacao,
                    plannedSupino,
                    plannedPuxada,
                    plannedElevacaoFront,
                    plannedRoscaDireta,
                    plannedTriceps,
                    plannedFacePull
            ));

            // 1) Panturrilha Smith
            PlannedExercise plannedPanturrilhaSmith = new PlannedExercise();
            plannedPanturrilhaSmith.setWorkoutPlan(planoB);
            plannedPanturrilhaSmith.setExercise(panturrilhaSmith);
            plannedPanturrilhaSmith.setSequence(1);

            PlannedSet pantSmithSet1 = new PlannedSet();
            pantSmithSet1.setPlannedExercise(plannedPanturrilhaSmith);
            pantSmithSet1.setSetIndex(0);
            pantSmithSet1.setType("Warmup");
            pantSmithSet1.setTargetReps("10 a 12SM");
            pantSmithSet1.setRestTimeSeconds(30);

            PlannedSet pantSmithSet2 = new PlannedSet();
            pantSmithSet2.setPlannedExercise(plannedPanturrilhaSmith);
            pantSmithSet2.setSetIndex(1);
            pantSmithSet2.setType("Feeders");
            pantSmithSet2.setTargetReps("3 a 5SM");
            pantSmithSet2.setRestTimeSeconds(30);

            PlannedSet pantSmithSet3 = new PlannedSet();
            pantSmithSet3.setPlannedExercise(plannedPanturrilhaSmith);
            pantSmithSet3.setSetIndex(2);
            pantSmithSet3.setType("Feeders");
            pantSmithSet3.setTargetReps("3 a 5SM");
            pantSmithSet3.setRestTimeSeconds(30);

            PlannedSet pantSmithSet4 = new PlannedSet();
            pantSmithSet4.setPlannedExercise(plannedPanturrilhaSmith);
            pantSmithSet4.setSetIndex(3);
            pantSmithSet4.setType("Reservas");
            pantSmithSet4.setTargetReps("8-12 (1RIR)");
            pantSmithSet4.setRestTimeSeconds(120);

            PlannedSet pantSmithSet5 = new PlannedSet();
            pantSmithSet5.setPlannedExercise(plannedPanturrilhaSmith);
            pantSmithSet5.setSetIndex(4);
            pantSmithSet5.setType("Reservas");
            pantSmithSet5.setTargetReps("8-12 (1RIR)");
            pantSmithSet5.setRestTimeSeconds(120);

            PlannedSet pantSmithSet6 = new PlannedSet();
            pantSmithSet6.setPlannedExercise(plannedPanturrilhaSmith);
            pantSmithSet6.setSetIndex(5);
            pantSmithSet6.setType("Maxima");
            pantSmithSet6.setTargetReps("8-12");
            pantSmithSet6.setRestTimeSeconds(120);

            PlannedSet pantSmithSet7 = new PlannedSet();
            pantSmithSet7.setPlannedExercise(plannedPanturrilhaSmith);
            pantSmithSet7.setSetIndex(6);
            pantSmithSet7.setType("Maxima");
            pantSmithSet7.setTargetReps("8-12");
            pantSmithSet7.setRestTimeSeconds(120);

            plannedPanturrilhaSmith.setPlannedSets(Arrays.asList(
                    pantSmithSet1, pantSmithSet2, pantSmithSet3, pantSmithSet4, pantSmithSet5, pantSmithSet6, pantSmithSet7
            ));


// 2) Agachamento Articulado
            PlannedExercise plannedAgachArt = new PlannedExercise();
            plannedAgachArt.setWorkoutPlan(planoB);
            plannedAgachArt.setExercise(agachamentoArticulado);
            plannedAgachArt.setSequence(2);

            PlannedSet agachArtSet1 = new PlannedSet();
            agachArtSet1.setPlannedExercise(plannedAgachArt);
            agachArtSet1.setSetIndex(0);
            agachArtSet1.setType("Warmup");
            agachArtSet1.setTargetReps("10 a 12SM");
            agachArtSet1.setRestTimeSeconds(30);

            PlannedSet agachArtSet2 = new PlannedSet();
            agachArtSet2.setPlannedExercise(plannedAgachArt);
            agachArtSet2.setSetIndex(1);
            agachArtSet2.setType("Feeders");
            agachArtSet2.setTargetReps("3 a 5SM");
            agachArtSet2.setRestTimeSeconds(30);

            PlannedSet agachArtSet3 = new PlannedSet();
            agachArtSet3.setPlannedExercise(plannedAgachArt);
            agachArtSet3.setSetIndex(2);
            agachArtSet3.setType("Feeders");
            agachArtSet3.setTargetReps("3 a 5SM");
            agachArtSet3.setRestTimeSeconds(30);

            PlannedSet agachArtSet4 = new PlannedSet();
            agachArtSet4.setPlannedExercise(plannedAgachArt);
            agachArtSet4.setSetIndex(3);
            agachArtSet4.setType("Reservas");
            agachArtSet4.setTargetReps("6-10 (1RIR)");
            agachArtSet4.setRestTimeSeconds(120);

            PlannedSet agachArtSet5 = new PlannedSet();
            agachArtSet5.setPlannedExercise(plannedAgachArt);
            agachArtSet5.setSetIndex(4);
            agachArtSet5.setType("Maxima");
            agachArtSet5.setTargetReps("6-10");
            agachArtSet5.setRestTimeSeconds(120);

            plannedAgachArt.setPlannedSets(Arrays.asList(agachArtSet1, agachArtSet2, agachArtSet3, agachArtSet4, agachArtSet5));


// 3) RDL
            PlannedExercise plannedRdl = new PlannedExercise();
            plannedRdl.setWorkoutPlan(planoB);
            plannedRdl.setExercise(rdl);
            plannedRdl.setSequence(3);

            PlannedSet rdlSet1 = new PlannedSet();
            rdlSet1.setPlannedExercise(plannedRdl);
            rdlSet1.setSetIndex(0);
            rdlSet1.setType("Warmup");
            rdlSet1.setTargetReps("10 a 12SM");
            rdlSet1.setRestTimeSeconds(30);

            PlannedSet rdlSet2 = new PlannedSet();
            rdlSet2.setPlannedExercise(plannedRdl);
            rdlSet2.setSetIndex(1);
            rdlSet2.setType("Feeders");
            rdlSet2.setTargetReps("3 a 5SM");
            rdlSet2.setRestTimeSeconds(30);

            PlannedSet rdlSet3 = new PlannedSet();
            rdlSet3.setPlannedExercise(plannedRdl);
            rdlSet3.setSetIndex(2);
            rdlSet3.setType("Feeders");
            rdlSet3.setTargetReps("3 a 5SM");
            rdlSet3.setRestTimeSeconds(30);

            PlannedSet rdlSet4 = new PlannedSet();
            rdlSet4.setPlannedExercise(plannedRdl);
            rdlSet4.setSetIndex(3);
            rdlSet4.setType("Reservas");
            rdlSet4.setTargetReps("6-10 (1RIR)");
            rdlSet4.setRestTimeSeconds(120);

            PlannedSet rdlSet5 = new PlannedSet();
            rdlSet5.setPlannedExercise(plannedRdl);
            rdlSet5.setSetIndex(4);
            rdlSet5.setType("Maxima");
            rdlSet5.setTargetReps("6-10");
            rdlSet5.setRestTimeSeconds(120);

            plannedRdl.setPlannedSets(Arrays.asList(rdlSet1, rdlSet2, rdlSet3, rdlSet4, rdlSet5));


// 4) Cadeira Adutora
            PlannedExercise plannedAdutora = new PlannedExercise();
            plannedAdutora.setWorkoutPlan(planoB);
            plannedAdutora.setExercise(cadeiraAdutora);
            plannedAdutora.setSequence(4);

            PlannedSet adutoraSet1 = new PlannedSet();
            adutoraSet1.setPlannedExercise(plannedAdutora);
            adutoraSet1.setSetIndex(0);
            adutoraSet1.setType("Warmup");
            adutoraSet1.setTargetReps("10 a 12SM");
            adutoraSet1.setRestTimeSeconds(30);

            PlannedSet adutoraSet2 = new PlannedSet();
            adutoraSet2.setPlannedExercise(plannedAdutora);
            adutoraSet2.setSetIndex(1);
            adutoraSet2.setType("Feeders");
            adutoraSet2.setTargetReps("3 a 5SM");
            adutoraSet2.setRestTimeSeconds(30);

            PlannedSet adutoraSet3 = new PlannedSet();
            adutoraSet3.setPlannedExercise(plannedAdutora);
            adutoraSet3.setSetIndex(2);
            adutoraSet3.setType("Feeders");
            adutoraSet3.setTargetReps("3 a 5SM");
            adutoraSet3.setRestTimeSeconds(30);

            PlannedSet adutoraSet4 = new PlannedSet();
            adutoraSet4.setPlannedExercise(plannedAdutora);
            adutoraSet4.setSetIndex(3);
            adutoraSet4.setType("Reservas");
            adutoraSet4.setTargetReps("8-12 (1RIR)");
            adutoraSet4.setRestTimeSeconds(120);

            PlannedSet adutoraSet5 = new PlannedSet();
            adutoraSet5.setPlannedExercise(plannedAdutora);
            adutoraSet5.setSetIndex(4);
            adutoraSet5.setType("Maxima");
            adutoraSet5.setTargetReps("8-12");
            adutoraSet5.setRestTimeSeconds(120);

            plannedAdutora.setPlannedSets(Arrays.asList(adutoraSet1, adutoraSet2, adutoraSet3, adutoraSet4, adutoraSet5));


// 5) Cadeira Extensora
            PlannedExercise plannedExtensora = new PlannedExercise();
            plannedExtensora.setWorkoutPlan(planoB);
            plannedExtensora.setExercise(cadeiraExtensora);
            plannedExtensora.setSequence(5);

            PlannedSet extSet1 = new PlannedSet();
            extSet1.setPlannedExercise(plannedExtensora);
            extSet1.setSetIndex(0);
            extSet1.setType("Feeders");
            extSet1.setTargetReps("3 a 5SM");
            extSet1.setRestTimeSeconds(30);

            PlannedSet extSet2 = new PlannedSet();
            extSet2.setPlannedExercise(plannedExtensora);
            extSet2.setSetIndex(1);
            extSet2.setType("Reservas");
            extSet2.setTargetReps("8-12 (1RIR)");
            extSet2.setRestTimeSeconds(120);

            PlannedSet extSet3 = new PlannedSet();
            extSet3.setPlannedExercise(plannedExtensora);
            extSet3.setSetIndex(2);
            extSet3.setType("Maxima");
            extSet3.setTargetReps("8-12");
            extSet3.setRestTimeSeconds(120);

            plannedExtensora.setPlannedSets(Arrays.asList(extSet1, extSet2, extSet3));


// 6) Cadeira Flexora
            PlannedExercise plannedFlexora = new PlannedExercise();
            plannedFlexora.setWorkoutPlan(planoB);
            plannedFlexora.setExercise(cadeiraFlexora);
            plannedFlexora.setSequence(6);

            PlannedSet flexSet1 = new PlannedSet();
            flexSet1.setPlannedExercise(plannedFlexora);
            flexSet1.setSetIndex(0);
            flexSet1.setType("Feeders");
            flexSet1.setTargetReps("3 a 5SM");
            flexSet1.setRestTimeSeconds(30);

            PlannedSet flexSet2 = new PlannedSet();
            flexSet2.setPlannedExercise(plannedFlexora);
            flexSet2.setSetIndex(1);
            flexSet2.setType("Reservas");
            flexSet2.setTargetReps("8-12 (1RIR)");
            flexSet2.setRestTimeSeconds(120);

            PlannedSet flexSet3 = new PlannedSet();
            flexSet3.setPlannedExercise(plannedFlexora);
            flexSet3.setSetIndex(2);
            flexSet3.setType("Maxima");
            flexSet3.setTargetReps("8-12");
            flexSet3.setRestTimeSeconds(120);

            plannedFlexora.setPlannedSets(Arrays.asList(flexSet1, flexSet2, flexSet3));


// Associar todos ao plano B
            planoB.setPlannedExercises(Arrays.asList(
                    plannedPanturrilhaSmith,
                    plannedAgachArt,
                    plannedRdl,
                    plannedAdutora,
                    plannedExtensora,
                    plannedFlexora
            ));

            // 1) Pull Down
            PlannedExercise plannedPullDown = new PlannedExercise();
            plannedPullDown.setWorkoutPlan(planoC);
            plannedPullDown.setExercise(pullDown);
            plannedPullDown.setSequence(1);

            PlannedSet pullDownSet1 = new PlannedSet();
            pullDownSet1.setPlannedExercise(plannedPullDown);
            pullDownSet1.setSetIndex(0);
            pullDownSet1.setType("Warmup");
            pullDownSet1.setTargetReps("10 a 12SM");
            pullDownSet1.setRestTimeSeconds(30);

            PlannedSet pullDownSet2 = new PlannedSet();
            pullDownSet2.setPlannedExercise(plannedPullDown);
            pullDownSet2.setSetIndex(1);
            pullDownSet2.setType("Feeders");
            pullDownSet2.setTargetReps("3 a 5SM");
            pullDownSet2.setRestTimeSeconds(30);

            PlannedSet pullDownSet3 = new PlannedSet();
            pullDownSet3.setPlannedExercise(plannedPullDown);
            pullDownSet3.setSetIndex(2);
            pullDownSet3.setType("Feeders");
            pullDownSet3.setTargetReps("3 a 5SM");
            pullDownSet3.setRestTimeSeconds(30);

            PlannedSet pullDownSet4 = new PlannedSet();
            pullDownSet4.setPlannedExercise(plannedPullDown);
            pullDownSet4.setSetIndex(3);
            pullDownSet4.setType("Reservas");
            pullDownSet4.setTargetReps("12-15 (1RIR)");
            pullDownSet4.setRestTimeSeconds(120);

            PlannedSet pullDownSet5 = new PlannedSet();
            pullDownSet5.setPlannedExercise(plannedPullDown);
            pullDownSet5.setSetIndex(4);
            pullDownSet5.setType("Maxima");
            pullDownSet5.setTargetReps("12-15");
            pullDownSet5.setRestTimeSeconds(120);

            plannedPullDown.setPlannedSets(Arrays.asList(pullDownSet1, pullDownSet2, pullDownSet3, pullDownSet4, pullDownSet5));


// 2) Remada Alta Halter Uni.
            PlannedExercise plannedRemadaAlta = new PlannedExercise();
            plannedRemadaAlta.setWorkoutPlan(planoC);
            plannedRemadaAlta.setExercise(remadaAltaHalterUni);
            plannedRemadaAlta.setSequence(2);

            PlannedSet remadaAltaSet1 = new PlannedSet();
            remadaAltaSet1.setPlannedExercise(plannedRemadaAlta);
            remadaAltaSet1.setSetIndex(0);
            remadaAltaSet1.setType("Warmup");
            remadaAltaSet1.setTargetReps("10 a 12SM");
            remadaAltaSet1.setRestTimeSeconds(30);

            PlannedSet remadaAltaSet2 = new PlannedSet();
            remadaAltaSet2.setPlannedExercise(plannedRemadaAlta);
            remadaAltaSet2.setSetIndex(1);
            remadaAltaSet2.setType("Feeders");
            remadaAltaSet2.setTargetReps("3 a 5SM");
            remadaAltaSet2.setRestTimeSeconds(30);

            PlannedSet remadaAltaSet3 = new PlannedSet();
            remadaAltaSet3.setPlannedExercise(plannedRemadaAlta);
            remadaAltaSet3.setSetIndex(2);
            remadaAltaSet3.setType("Feeders");
            remadaAltaSet3.setTargetReps("3 a 5SM");
            remadaAltaSet3.setRestTimeSeconds(30);

            PlannedSet remadaAltaSet4 = new PlannedSet();
            remadaAltaSet4.setPlannedExercise(plannedRemadaAlta);
            remadaAltaSet4.setSetIndex(3);
            remadaAltaSet4.setType("Reservas");
            remadaAltaSet4.setTargetReps("8-12 (1RIR)");
            remadaAltaSet4.setRestTimeSeconds(120);

            PlannedSet remadaAltaSet5 = new PlannedSet();
            remadaAltaSet5.setPlannedExercise(plannedRemadaAlta);
            remadaAltaSet5.setSetIndex(4);
            remadaAltaSet5.setType("Maxima");
            remadaAltaSet5.setTargetReps("8-12");
            remadaAltaSet5.setRestTimeSeconds(120);

            plannedRemadaAlta.setPlannedSets(Arrays.asList(remadaAltaSet1, remadaAltaSet2, remadaAltaSet3, remadaAltaSet4, remadaAltaSet5));


            PlannedExercise plannedCrucifixo = new PlannedExercise();
            plannedCrucifixo.setWorkoutPlan(planoC);
            plannedCrucifixo.setExercise(crucifixoMaquina);
            plannedCrucifixo.setSequence(3);

            PlannedSet crucifixoSet1 = new PlannedSet();
            crucifixoSet1.setPlannedExercise(plannedCrucifixo);
            crucifixoSet1.setSetIndex(0);
            crucifixoSet1.setType("Warmup");
            crucifixoSet1.setTargetReps("10 a 12SM");
            crucifixoSet1.setRestTimeSeconds(30);

            PlannedSet crucifixoSet2 = new PlannedSet();
            crucifixoSet2.setPlannedExercise(plannedCrucifixo);
            crucifixoSet2.setSetIndex(1);
            crucifixoSet2.setType("Feeders");
            crucifixoSet2.setTargetReps("3 a 5SM");
            crucifixoSet2.setRestTimeSeconds(30);

            PlannedSet crucifixoSet3 = new PlannedSet();
            crucifixoSet3.setPlannedExercise(plannedCrucifixo);
            crucifixoSet3.setSetIndex(2);
            crucifixoSet3.setType("Feeders");
            crucifixoSet3.setTargetReps("3 a 5SM");
            crucifixoSet3.setRestTimeSeconds(30);

            PlannedSet crucifixoSet4 = new PlannedSet();
            crucifixoSet4.setPlannedExercise(plannedCrucifixo);
            crucifixoSet4.setSetIndex(3);
            crucifixoSet4.setType("Reservas");
            crucifixoSet4.setTargetReps("8-12 (1RIR)");
            crucifixoSet4.setRestTimeSeconds(120);

            PlannedSet crucifixoSet5 = new PlannedSet();
            crucifixoSet5.setPlannedExercise(plannedCrucifixo);
            crucifixoSet5.setSetIndex(4);
            crucifixoSet5.setType("Maxima");
            crucifixoSet5.setTargetReps("8-12");
            crucifixoSet5.setRestTimeSeconds(120);

            plannedCrucifixo.setPlannedSets(Arrays.asList(crucifixoSet1, crucifixoSet2, crucifixoSet3, crucifixoSet4, crucifixoSet5));


// 4) Puxada Alta Aberta
            PlannedExercise plannedPuxadaAberta = new PlannedExercise();
            plannedPuxadaAberta.setWorkoutPlan(planoC);
            plannedPuxadaAberta.setExercise(puxadaAltaAberta);
            plannedPuxadaAberta.setSequence(4);

            PlannedSet puxadaAbertaSet1 = new PlannedSet();
            puxadaAbertaSet1.setPlannedExercise(plannedPuxadaAberta);
            puxadaAbertaSet1.setSetIndex(0);
            puxadaAbertaSet1.setType("Feeders");
            puxadaAbertaSet1.setTargetReps("3 a 5SM");
            puxadaAbertaSet1.setRestTimeSeconds(30);

            PlannedSet puxadaAbertaSet2 = new PlannedSet();
            puxadaAbertaSet2.setPlannedExercise(plannedPuxadaAberta);
            puxadaAbertaSet2.setSetIndex(1);
            puxadaAbertaSet2.setType("Feeders");
            puxadaAbertaSet2.setTargetReps("3 a 5SM");
            puxadaAbertaSet2.setRestTimeSeconds(30);

            PlannedSet puxadaAbertaSet3 = new PlannedSet();
            puxadaAbertaSet3.setPlannedExercise(plannedPuxadaAberta);
            puxadaAbertaSet3.setSetIndex(2);
            puxadaAbertaSet3.setType("Reservas");
            puxadaAbertaSet3.setTargetReps("8-12 (1RIR)");
            puxadaAbertaSet3.setRestTimeSeconds(120);

            PlannedSet puxadaAbertaSet4 = new PlannedSet();
            puxadaAbertaSet4.setPlannedExercise(plannedPuxadaAberta);
            puxadaAbertaSet4.setSetIndex(3);
            puxadaAbertaSet4.setType("Maxima");
            puxadaAbertaSet4.setTargetReps("8-12");
            puxadaAbertaSet4.setRestTimeSeconds(120);

            plannedPuxadaAberta.setPlannedSets(Arrays.asList(puxadaAbertaSet1, puxadaAbertaSet2, puxadaAbertaSet3, puxadaAbertaSet4));


// 5) Push Down Ajoelhado
            PlannedExercise plannedPushDown = new PlannedExercise();
            plannedPushDown.setWorkoutPlan(planoC);
            plannedPushDown.setExercise(pushDownAjoelhado);
            plannedPushDown.setSequence(5);

            PlannedSet pushDownSet1 = new PlannedSet();
            pushDownSet1.setPlannedExercise(plannedPushDown);
            pushDownSet1.setSetIndex(0);
            pushDownSet1.setType("Feeders");
            pushDownSet1.setTargetReps("3 a 5SM");
            pushDownSet1.setRestTimeSeconds(30);

            PlannedSet pushDownSet2 = new PlannedSet();
            pushDownSet2.setPlannedExercise(plannedPushDown);
            pushDownSet2.setSetIndex(1);
            pushDownSet2.setType("Feeders");
            pushDownSet2.setTargetReps("3 a 5SM");
            pushDownSet2.setRestTimeSeconds(30);

            PlannedSet pushDownSet3 = new PlannedSet();
            pushDownSet3.setPlannedExercise(plannedPushDown);
            pushDownSet3.setSetIndex(2);
            pushDownSet3.setType("Reservas");
            pushDownSet3.setTargetReps("8-12 (1RIR)");
            pushDownSet3.setRestTimeSeconds(120);

            PlannedSet pushDownSet4 = new PlannedSet();
            pushDownSet4.setPlannedExercise(plannedPushDown);
            pushDownSet4.setSetIndex(3);
            pushDownSet4.setType("Maxima");
            pushDownSet4.setTargetReps("8-12");
            pushDownSet4.setRestTimeSeconds(120);

            plannedPushDown.setPlannedSets(Arrays.asList(pushDownSet1, pushDownSet2, pushDownSet3, pushDownSet4));


// 6) Rosca Martelo Halter
            PlannedExercise plannedMartelo = new PlannedExercise();
            plannedMartelo.setWorkoutPlan(planoC);
            plannedMartelo.setExercise(roscaMarteloHalter);
            plannedMartelo.setSequence(6);

            PlannedSet marteloSet1 = new PlannedSet();
            marteloSet1.setPlannedExercise(plannedMartelo);
            marteloSet1.setSetIndex(0);
            marteloSet1.setType("Feeders");
            marteloSet1.setTargetReps("3 a 5SM");
            marteloSet1.setRestTimeSeconds(30);

            PlannedSet marteloSet2 = new PlannedSet();
            marteloSet2.setPlannedExercise(plannedMartelo);
            marteloSet2.setSetIndex(1);
            marteloSet2.setType("Feeders");
            marteloSet2.setTargetReps("3 a 5SM");
            marteloSet2.setRestTimeSeconds(30);

            PlannedSet marteloSet3 = new PlannedSet();
            marteloSet3.setPlannedExercise(plannedMartelo);
            marteloSet3.setSetIndex(2);
            marteloSet3.setType("Reservas");
            marteloSet3.setTargetReps("8-12 (1RIR)");
            marteloSet3.setRestTimeSeconds(120);

            PlannedSet marteloSet4 = new PlannedSet();
            marteloSet4.setPlannedExercise(plannedMartelo);
            marteloSet4.setSetIndex(3);
            marteloSet4.setType("Maxima");
            marteloSet4.setTargetReps("8-12");
            marteloSet4.setRestTimeSeconds(120);

            PlannedSet marteloSet5 = new PlannedSet();
            marteloSet5.setPlannedExercise(plannedMartelo);
            marteloSet5.setSetIndex(4);
            marteloSet5.setType("Maxima");
            marteloSet5.setTargetReps("8-12");
            marteloSet5.setRestTimeSeconds(120);

            plannedMartelo.setPlannedSets(Arrays.asList(marteloSet1, marteloSet2, marteloSet3, marteloSet4, marteloSet5));


// 7) Abdominal Articulado
            PlannedExercise plannedAbdominal = new PlannedExercise();
            plannedAbdominal.setWorkoutPlan(planoC);
            plannedAbdominal.setExercise(abdominalArticulado);
            plannedAbdominal.setSequence(7);

            PlannedSet abdSet1 = new PlannedSet();
            abdSet1.setPlannedExercise(plannedAbdominal);
            abdSet1.setSetIndex(0);
            abdSet1.setType("Feeders");
            abdSet1.setTargetReps("3 a 5SM");
            abdSet1.setRestTimeSeconds(30);

            PlannedSet abdSet2 = new PlannedSet();
            abdSet2.setPlannedExercise(plannedAbdominal);
            abdSet2.setSetIndex(1);
            abdSet2.setType("Feeders");
            abdSet2.setTargetReps("3 a 5SM");
            abdSet2.setRestTimeSeconds(30);

            PlannedSet abdSet3 = new PlannedSet();
            abdSet3.setPlannedExercise(plannedAbdominal);
            abdSet3.setSetIndex(2);
            abdSet3.setType("Maxima");
            abdSet3.setTargetReps("8-12");
            abdSet3.setRestTimeSeconds(120);

            PlannedSet abdSet4 = new PlannedSet();
            abdSet4.setPlannedExercise(plannedAbdominal);
            abdSet4.setSetIndex(3);
            abdSet4.setType("Maxima");
            abdSet4.setTargetReps("8-12");
            abdSet4.setRestTimeSeconds(120);

            PlannedSet abdSet5 = new PlannedSet();
            abdSet5.setPlannedExercise(plannedAbdominal);
            abdSet5.setSetIndex(4);
            abdSet5.setType("Maxima");
            abdSet5.setTargetReps("8-12");
            abdSet5.setRestTimeSeconds(120);

            plannedAbdominal.setPlannedSets(Arrays.asList(abdSet1, abdSet2, abdSet3, abdSet4, abdSet5));


// Associar todos ao plano C
            planoC.setPlannedExercises(Arrays.asList(
                    plannedPullDown,
                    plannedRemadaAlta,
                    plannedCrucifixo,
                    plannedPuxadaAberta,
                    plannedPushDown,
                    plannedMartelo,
                    plannedAbdominal
            ));


// 1) Panturrilha Leg 180°
            PlannedExercise peD1 = new PlannedExercise();
            peD1.setWorkoutPlan(planoD);
            peD1.setExercise(panturrilhaLeg180);
            peD1.setSequence(1);

            PlannedSet d1Set1 = new PlannedSet();
            d1Set1.setPlannedExercise(peD1);
            d1Set1.setSetIndex(0);
            d1Set1.setType("Warmup");
            d1Set1.setTargetReps("10 a 12SM");
            d1Set1.setRestTimeSeconds(30);

            PlannedSet d1Set2 = new PlannedSet();
            d1Set2.setPlannedExercise(peD1);
            d1Set2.setSetIndex(1);
            d1Set2.setType("Feeders");
            d1Set2.setTargetReps("3 a 5SM");
            d1Set2.setRestTimeSeconds(30);

            PlannedSet d1Set3 = new PlannedSet();
            d1Set3.setPlannedExercise(peD1);
            d1Set3.setSetIndex(2);
            d1Set3.setType("Reservas");
            d1Set3.setTargetReps("8-12 (2RIR)");
            d1Set3.setRestTimeSeconds(120);

            PlannedSet d1Set4 = new PlannedSet();
            d1Set4.setPlannedExercise(peD1);
            d1Set4.setSetIndex(3);
            d1Set4.setType("Reservas");
            d1Set4.setTargetReps("8-12 (2RIR)");
            d1Set4.setRestTimeSeconds(120);

            PlannedSet d1Set5 = new PlannedSet();
            d1Set5.setPlannedExercise(peD1);
            d1Set5.setSetIndex(4);
            d1Set5.setType("Maxima");
            d1Set5.setTargetReps("8-12");
            d1Set5.setRestTimeSeconds(120);

            peD1.setPlannedSets(Arrays.asList(d1Set1, d1Set2, d1Set3, d1Set4, d1Set5));


// 2) RDL
            PlannedExercise peD2 = new PlannedExercise();
            peD2.setWorkoutPlan(planoD);
            peD2.setExercise(rdl);
            peD2.setSequence(2);

            PlannedSet d2Set1 = new PlannedSet();
            d2Set1.setPlannedExercise(peD2);
            d2Set1.setSetIndex(0);
            d2Set1.setType("Warmup");
            d2Set1.setTargetReps("10 a 12SM");
            d2Set1.setRestTimeSeconds(30);

            PlannedSet d2Set2 = new PlannedSet();
            d2Set2.setPlannedExercise(peD2);
            d2Set2.setSetIndex(1);
            d2Set2.setType("Feeders");
            d2Set2.setTargetReps("3 a 5SM");
            d2Set2.setRestTimeSeconds(30);

            PlannedSet d2Set3 = new PlannedSet();
            d2Set3.setPlannedExercise(peD2);
            d2Set3.setSetIndex(2);
            d2Set3.setType("Reservas");
            d2Set3.setTargetReps("8-12 (2RIR)");
            d2Set3.setRestTimeSeconds(120);

            PlannedSet d2Set4 = new PlannedSet();
            d2Set4.setPlannedExercise(peD2);
            d2Set4.setSetIndex(3);
            d2Set4.setType("Maxima");
            d2Set4.setTargetReps("8-12");
            d2Set4.setRestTimeSeconds(120);

            peD2.setPlannedSets(Arrays.asList(d2Set1, d2Set2, d2Set3, d2Set4));


// 3) Agachamento Smith
            PlannedExercise peD3 = new PlannedExercise();
            peD3.setWorkoutPlan(planoD);
            peD3.setExercise(agachamentoSmith);
            peD3.setSequence(3);

            PlannedSet d3Set1 = new PlannedSet();
            d3Set1.setPlannedExercise(peD3);
            d3Set1.setSetIndex(0);
            d3Set1.setType("Warmup");
            d3Set1.setTargetReps("10 a 12SM");
            d3Set1.setRestTimeSeconds(30);

            PlannedSet d3Set2 = new PlannedSet();
            d3Set2.setPlannedExercise(peD3);
            d3Set2.setSetIndex(1);
            d3Set2.setType("Feeders");
            d3Set2.setTargetReps("3 a 5SM");
            d3Set2.setRestTimeSeconds(30);

            PlannedSet d3Set3 = new PlannedSet();
            d3Set3.setPlannedExercise(peD3);
            d3Set3.setSetIndex(2);
            d3Set3.setType("Reservas");
            d3Set3.setTargetReps("8-12 (2RIR)");
            d3Set3.setRestTimeSeconds(120);

            PlannedSet d3Set4 = new PlannedSet();
            d3Set4.setPlannedExercise(peD3);
            d3Set4.setSetIndex(3);
            d3Set4.setType("Reservas");
            d3Set4.setTargetReps("8-12 (2RIR)");
            d3Set4.setRestTimeSeconds(120);

            PlannedSet d3Set5 = new PlannedSet();
            d3Set5.setPlannedExercise(peD3);
            d3Set5.setSetIndex(4);
            d3Set5.setType("Maxima");
            d3Set5.setTargetReps("8-12");
            d3Set5.setRestTimeSeconds(120);

            peD3.setPlannedSets(Arrays.asList(d3Set1, d3Set2, d3Set3, d3Set4, d3Set5));


// 4) Cadeira Abdutora
            PlannedExercise peD4 = new PlannedExercise();
            peD4.setWorkoutPlan(planoD);
            peD4.setExercise(cadeiraAbdutora);
            peD4.setSequence(4);

            PlannedSet d4Set1 = new PlannedSet();
            d4Set1.setPlannedExercise(peD4);
            d4Set1.setSetIndex(0);
            d4Set1.setType("Warmup");
            d4Set1.setTargetReps("10 a 12SM");
            d4Set1.setRestTimeSeconds(30);

            PlannedSet d4Set2 = new PlannedSet();
            d4Set2.setPlannedExercise(peD4);
            d4Set2.setSetIndex(1);
            d4Set2.setType("Feeders");
            d4Set2.setTargetReps("3 a 5SM");
            d4Set2.setRestTimeSeconds(30);

            PlannedSet d4Set3 = new PlannedSet();
            d4Set3.setPlannedExercise(peD4);
            d4Set3.setSetIndex(2);
            d4Set3.setType("Reservas");
            d4Set3.setTargetReps("8-12 (2RIR)");
            d4Set3.setRestTimeSeconds(120);

            PlannedSet d4Set4 = new PlannedSet();
            d4Set4.setPlannedExercise(peD4);
            d4Set4.setSetIndex(3);
            d4Set4.setType("Reservas");
            d4Set4.setTargetReps("8-12 (2RIR)");
            d4Set4.setRestTimeSeconds(120);

            PlannedSet d4Set5 = new PlannedSet();
            d4Set5.setPlannedExercise(peD4);
            d4Set5.setSetIndex(4);
            d4Set5.setType("Maxima");
            d4Set5.setTargetReps("8-12");
            d4Set5.setRestTimeSeconds(120);

            peD4.setPlannedSets(Arrays.asList(d4Set1, d4Set2, d4Set3, d4Set4, d4Set5));


// 5) Flexora em Pé
            PlannedExercise peD5 = new PlannedExercise();
            peD5.setWorkoutPlan(planoD);
            peD5.setExercise(flexoraEmPe);
            peD5.setSequence(5);

            PlannedSet d5Set1 = new PlannedSet();
            d5Set1.setPlannedExercise(peD5);
            d5Set1.setSetIndex(0);
            d5Set1.setType("Feeders");
            d5Set1.setTargetReps("3 a 5SM");
            d5Set1.setRestTimeSeconds(30);

            PlannedSet d5Set2 = new PlannedSet();
            d5Set2.setPlannedExercise(peD5);
            d5Set2.setSetIndex(1);
            d5Set2.setType("Feeders");
            d5Set2.setTargetReps("3 a 5SM");
            d5Set2.setRestTimeSeconds(30);

            PlannedSet d5Set3 = new PlannedSet();
            d5Set3.setPlannedExercise(peD5);
            d5Set3.setSetIndex(2);
            d5Set3.setType("Reservas");
            d5Set3.setTargetReps("8-12 (2RIR)");
            d5Set3.setRestTimeSeconds(120);

            PlannedSet d5Set4 = new PlannedSet();
            d5Set4.setPlannedExercise(peD5);
            d5Set4.setSetIndex(3);
            d5Set4.setType("Reservas");
            d5Set4.setTargetReps("8-12 (2RIR)");
            d5Set4.setRestTimeSeconds(120);

            PlannedSet d5Set5 = new PlannedSet();
            d5Set5.setPlannedExercise(peD5);
            d5Set5.setSetIndex(4);
            d5Set5.setType("Maxima");
            d5Set5.setTargetReps("8-12");
            d5Set5.setRestTimeSeconds(120);

            peD5.setPlannedSets(Arrays.asList(d5Set1, d5Set2, d5Set3, d5Set4, d5Set5));


// 6) Cadeira Extensora
            PlannedExercise peD6 = new PlannedExercise();
            peD6.setWorkoutPlan(planoD);
            peD6.setExercise(cadeiraExtensora);
            peD6.setSequence(6);

            PlannedSet d6Set1 = new PlannedSet();
            d6Set1.setPlannedExercise(peD6);
            d6Set1.setSetIndex(0);
            d6Set1.setType("Feeders");
            d6Set1.setTargetReps("3 a 5SM");
            d6Set1.setRestTimeSeconds(30);

            PlannedSet d6Set2 = new PlannedSet();
            d6Set2.setPlannedExercise(peD6);
            d6Set2.setSetIndex(1);
            d6Set2.setType("Reservas");
            d6Set2.setTargetReps("8-12 (2RIR)");
            d6Set2.setRestTimeSeconds(120);


            PlannedSet d6Set3 = new PlannedSet();
            d6Set3.setPlannedExercise(peD6);
            d6Set3.setSetIndex(2);
            d6Set3.setType("Maxima");
            d6Set3.setTargetReps("8-12");
            d6Set3.setRestTimeSeconds(120);

            peD6.setPlannedSets(Arrays.asList(d6Set1, d6Set2, d6Set3));


// Associar todos ao plano D
            planoD.setPlannedExercises(Arrays.asList(peD1, peD2, peD3, peD4, peD5, peD6));


            System.out.println("Salvando planos no banco de dados...");
            workoutPlanRepository.saveAll(Arrays.asList(planoA, planoB, planoC, planoD));
            System.out.println("Planos salvos com sucesso.");
        }
    }
}
